package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;
import technifutur.Rental_Management.mapper.Mapper_category;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.entity.Category;
import technifutur.Rental_Management.model.form.CategoryCreateForm;
import technifutur.Rental_Management.repository.CategoryRepository;
import technifutur.Rental_Management.repository.PriceRepository;
import technifutur.Rental_Management.service.CategoryService;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final PriceRepository priceRepository;

    private final Mapper_category mapperCategory;

    @PersistenceContext
    private EntityManager entityManager;

    public CategoryServiceImpl(CategoryRepository categoryRepository,
                    PriceRepository priceRepository,
                    Mapper_category mapperCategory){
        this.categoryRepository = categoryRepository;
        this.mapperCategory = mapperCategory;
        this.priceRepository = priceRepository;
    }

    @Override
    @Transactional
    public void create(CategoryCreateForm form) {

        Category category = mapperCategory.toCategoryEntity(form);

    }

    @Override
    public List<CategoryDTO> getAll() {
        return null;
    }

    @Override
    public CategoryDTO getOne(long id) {
        return null;
    }

    @Override
    public CategoryDTO update(CategoryCreateForm form,long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
