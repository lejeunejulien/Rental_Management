package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.exception.RessourceNotFoundException;
import technifutur.Rental_Management.mapper.Mapper_supplier;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.dto.SupplierDTO;
import technifutur.Rental_Management.model.entity.Supplier;
import technifutur.Rental_Management.model.form.SupplierCreateForm;
import technifutur.Rental_Management.repository.SupplierRepository;
import technifutur.Rental_Management.service.SupplierService;

import java.util.List;


@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;
    private final Mapper_supplier mapperSupplier;


    @PersistenceContext
    private EntityManager entityManager;

    public SupplierServiceImpl(SupplierRepository supplierRepository,
                               Mapper_supplier mapperSupplier){
        this.supplierRepository=supplierRepository;
        this.mapperSupplier=mapperSupplier;
    }
    @Override
    @Transactional
    public SupplierDTO create(SupplierCreateForm form) {
        Supplier supplier = mapperSupplier.toSupplierEntity(form);

        supplierRepository.save(supplier);
        return mapperSupplier.toSupplierDTO(supplier);
    }


    @Override
    @Transactional
    public SupplierDTO getOne(long id) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);
        return mapperSupplier.toSupplierDTO(supplier);

    }
    @Override
    public List<SupplierDTO> getAll() {
        List<SupplierDTO> list_supplier_getAll = supplierRepository.findAll().stream()
                .map(v->mapperSupplier.toSupplierDTO(v))
                //.map(mapperVehicleProperties::toVehiclePropertiesDTO)
                .toList();
        return list_supplier_getAll;

    }

    @Override
    @Transactional
    public SupplierDTO update(SupplierCreateForm form, long id) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);
        supplier.setName(form.getName());
        supplier.setAdress(form.getAdress());
        supplier.setTel(form.getTel());
        supplier.setPurchase_price(form.getPurchase_price());

        supplierRepository.save(supplier);

        return mapperSupplier.toSupplierDTO(supplier);
    }

    @Override
    public void delete(long id) {
        supplierRepository.deleteById(id);

    }
}
