package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
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
import java.util.Optional;


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
    public void create(VehiclePropertiesCreateForm form) {

        //Creation entity et insertion d'une partie des valeurs du form dans l'entity
        Vehicle_properties vehicle_properties = mapperVehicleProperties.toVehiclePropertiesEntity(form);

        Category category = categoryRepository.findById(form.getId_category());
        Supplier supplier = supplierRepository.findById(form.getId_supplier());

        vehicle_properties.setCategory(category);
        vehicle_properties.setSupplier(supplier);

        categoryRepository.save(category);
    }
    @Override
    public List<Vehicle_propertiesDTO> getAll() {

        List<Vehicle_propertiesDTO> list_vehicle_properties_getAll = vehiclePropertiesRepository.findAll().stream()
                .map(v->mapperVehicleProperties.toVehiclePropertiesDTO(v))
                .toList();
        return list_vehicle_properties_getAll;

    }

    @Override
    public Vehicle_propertiesDTO getOne(Long id) {
        //Tester d'autres variantes (Greg)
        // Variante 1
        Vehicle_properties vehicle_properties = vehiclePropertiesRepository.findById(id);
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
    public void update(long id) {
        /*
        if(!vehiclePropertiesRepository.existsById(id)){
            throw new RessourceNotFoundException();
        }
        */

        // Variante 1
        vehiclePropertiesRepository.

    }

    @Override
    public void delete(long id) {

    }
}

