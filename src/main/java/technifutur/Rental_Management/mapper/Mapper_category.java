package technifutur.Rental_Management.mapper;

import lombok.Data;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.entity.Category;
import technifutur.Rental_Management.model.form.CategoryCreateForm;

@Service
public class Mapper_category {

    private Mapper_price mapper_price;

    public CategoryDTO toCategoryDTO(Category entity){

        CategoryDTO dto = new CategoryDTO();
        dto.setBrand(entity.getBrand());
        dto.setModel(entity.getModel());
        dto.setPrice(mapper_price.toPriceDTO(entity.getPrice()));

        return dto;

    }

    public Category toCategoryEntity(CategoryCreateForm form){
        Category entity = new Category();
        entity.setBrand(form.getBrand());
        entity.setModel(form.getModel());
        // price -> Service

        return entity;
    }
}
