package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;
import technifutur.Rental_Management.exception.RessourceNotFoundException;
import technifutur.Rental_Management.mapper.Mapper_category;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.entity.Category;
import technifutur.Rental_Management.model.entity.Price;
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
    public CategoryDTO create(CategoryCreateForm form) {

        Category category = mapperCategory.toCategoryEntity(form);

        Price price = priceRepository.findById(form.getId_price())
                .orElseThrow(RessourceNotFoundException::new);

        category.setPrice(price);

        categoryRepository.save(category);

        return mapperCategory.toCategoryDTO(category);
    }

    @Override
    public List<CategoryDTO> getAll() {
        List<CategoryDTO> list_category_getAll = categoryRepository.findAll().stream()
                .map(v->mapperCategory.toCategoryDTO(v))
                .toList();
        return list_category_getAll;
    }

    @Override
    @Transactional
    public CategoryDTO getOne(long id) {
        Category category = entityManager.find(Category.class,id);
        return mapperCategory.toCategoryDTO(category);
    }

    @Override
    @Transactional
    public CategoryDTO update(CategoryCreateForm form,long id) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);

        Price price = priceRepository.findById(form.getId_price())
                .orElseThrow(RessourceNotFoundException::new);

        category.setPrice(price);

        category.setModel(form.getModel());
        category.setBrand(form.getBrand());

        categoryRepository.save(category);

        return mapperCategory.toCategoryDTO(category);
    }

    @Override
    public void delete(long id) {
        categoryRepository.deleteById(id);
    }
}
