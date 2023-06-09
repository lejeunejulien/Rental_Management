package technifutur.Rental_Management.service;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.form.CategoryCreateForm;

import java.util.List;

public interface CategoryService {
    CategoryDTO create(CategoryCreateForm form);

    List<CategoryDTO> getAll();

    CategoryDTO getOne(long id);

    CategoryDTO update(CategoryCreateForm form,long id);

    void delete(long id);



}
