package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.exception.RessourceNotFoundException;
import technifutur.Rental_Management.mapper.Mapper_vehicle_properties;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO;
import technifutur.Rental_Management.model.entity.Category;
import technifutur.Rental_Management.model.entity.Supplier;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;
import technifutur.Rental_Management.repository.CategoryRepository;
import technifutur.Rental_Management.repository.SupplierRepository;
import technifutur.Rental_Management.repository.VehiclePropertiesRepository;
import technifutur.Rental_Management.service.VehiclePropertiesService;

import java.util.List;


@Service
public class VehiclePropertiesServiceImpl implements VehiclePropertiesService {

    private final CategoryRepository categoryRepository;
    private final SupplierRepository supplierRepository;
    private final Mapper_vehicle_properties mapperVehicleProperties;

    //On "importe" l'interface "vehiclepropertiesrepository" qui extend JPa -> on peut alors interagir avec la DB
    private final VehiclePropertiesRepository vehiclePropertiesRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public VehiclePropertiesServiceImpl(
            CategoryRepository categoryRepository,
            SupplierRepository supplierRepository,
            Mapper_vehicle_properties mapperVehicleProperties,
            VehiclePropertiesRepository vehiclePropertiesRepository
            ){

        this.categoryRepository = categoryRepository;
        this.supplierRepository = supplierRepository;
        this.mapperVehicleProperties = mapperVehicleProperties;
        this.vehiclePropertiesRepository = vehiclePropertiesRepository;
    }

    @Override
    @Transactional
    public Vehicle_propertiesDTO create(VehiclePropertiesCreateForm form) {

        //CREATION ENTITY et insertion d'une partie des valeurs du form dans l'entity
        Vehicle_properties vehicle_properties = mapperVehicleProperties.toVehiclePropertiesEntity(form);

        Category category = categoryRepository.findById(form.getId_category())
                .orElseThrow(RessourceNotFoundException::new);
        Supplier supplier = supplierRepository.findById(form.getId_supplier())
                .orElseThrow(RessourceNotFoundException::new);

        //On insert "Category" et "Supplier" dans cette nouvelle entity
        vehicle_properties.setCategory(category);
        vehicle_properties.setSupplier(supplier);

        //On sauvergarde cette entity sous forme de table dans la DB via JPa
        vehiclePropertiesRepository.save(vehicle_properties);

        return mapperVehicleProperties.toVehiclePropertiesDTO(vehicle_properties);
    }

    @Override
    @Transactional
    public Vehicle_propertiesDTO getOne(long id) {
        // Variante 1
        /*
        if(!vehiclePropertiesRepository.existsById(id)){
            //Throw -> il ne continue pas le code
            return null;
            throw new RessourceNotFoundException();
        }
        */

        Vehicle_properties vehicle_properties = vehiclePropertiesRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);
        return mapperVehicleProperties.toVehiclePropertiesDTO(vehicle_properties);


        // Variante 2
        /*
         Vehicle_properties vehicleProperties = entityManager.find(Vehicle_properties.class, id);
        return mapperVehicleProperties.toVehiclePropertiesDTO(vehicle_properties);
        */


        // Variante 3
        /*
        // TypedQuery<Vehicle_properties> query = entityManager.createQuery("SELECT b FROM Vehicle_properties b WHERE b.id = :param",Vehicle_properties.class);
        // query.setParameter("param", id);
        // return mapperVehicleProperties.toVehiclePropertiesDTO(query.getSingleResult());
        */
    }


    @Override
    @Transactional
    public List<Vehicle_propertiesDTO> getAll() {

        List<Vehicle_propertiesDTO> list_vehicle_properties_getAll = vehiclePropertiesRepository.findAll().stream()
                .map(v->mapperVehicleProperties.toVehiclePropertiesDTO(v))
                //.map(mapperVehicleProperties::toVehiclePropertiesDTO)
                .toList();
        return list_vehicle_properties_getAll;

    }

    @Transactional
    @Override
    public Vehicle_propertiesDTO update(VehiclePropertiesCreateForm form, long id) {
        /*
        if(!vehiclePropertiesRepository.existsById(id)){
            throw new RessourceNotFoundException();
        }
        */

        //RECUPERATION DE LA TABLE EXISTANTE dans la DB qui correspond à l'ID en paramètre
        Vehicle_properties vehicle_properties = vehiclePropertiesRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);

        // Check si il y a bien un form existant

        //Récuperation des tables Category et Supplier existantes via l'ID du form
        Category category = categoryRepository.findById(form.getId_category())
                .orElseThrow(RessourceNotFoundException::new);
        Supplier supplier = supplierRepository.findById(form.getId_supplier())
                .orElseThrow(RessourceNotFoundException::new);

        //On remplace "Category" et "Supplier" à partir de l'ID du form dans la table existante
        vehicle_properties.setCategory(category);
        vehicle_properties.setSupplier(supplier);

        //On remplace "Mileage","Year","EnginePower" du form dans la table existante
        vehicle_properties.setMileage(form.getMileage());
        vehicle_properties.setYear(form.getYear());
        vehicle_properties.setEngine_power(form.getEngine_power());

        vehiclePropertiesRepository.save(vehicle_properties);

        //Variante 2
        //Vehicle_properties vehicleProperties = entityManager.find(Vehicle_properties.class, id);
        //entityManager.persist(vehicleProperties);

        return mapperVehicleProperties.toVehiclePropertiesDTO(vehicle_properties);
    }

    @Transactional
    @Override
    public void delete(long id) {

        // Variante 1
        /*
        Vehicle_properties vehicleProperties = entityManager.find(Vehicle_properties.class, id);
        entityManager.remove(vehicleProperties);
         */

        // Variante 2
        vehiclePropertiesRepository.deleteById(id);
    }
}

