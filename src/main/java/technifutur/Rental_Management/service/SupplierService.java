package technifutur.Rental_Management.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.SupplierDTO;
import technifutur.Rental_Management.model.form.SupplierCreateForm;

import java.util.List;

@Service
public interface SupplierService {
    ResponseEntity<SupplierDTO> createSupplier(SupplierCreateForm form);

    List<SupplierDTO> getAll();

    void update(long id);

    void delete(long id);
}
