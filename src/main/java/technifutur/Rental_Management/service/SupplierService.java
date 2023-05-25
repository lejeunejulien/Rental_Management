package technifutur.Rental_Management.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.SupplierDTO;
import technifutur.Rental_Management.model.form.SupplierCreateForm;

import java.util.List;


public interface SupplierService {
    SupplierDTO create(SupplierCreateForm form);

    SupplierDTO getOne(long id);

    List<SupplierDTO> getAll();

    SupplierDTO update(SupplierCreateForm form, long id);

    void delete(long id);


}
