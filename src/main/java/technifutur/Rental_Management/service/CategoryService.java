package technifutur.Rental_Management.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.form.CategoryCreateForm;

import java.util.List;

@Service
public interface CategoryService {
    ResponseEntity<BookingDTO> createCategory(CategoryCreateForm form);

    List<CategoryDTO> getAll();

    void getOne(long id);

    void update(long id);

    void delete(long id);
}
