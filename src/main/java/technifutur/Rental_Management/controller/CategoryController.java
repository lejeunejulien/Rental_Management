package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.form.CategoryCreateForm;
import technifutur.Rental_Management.service.CategoryService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){

        this.categoryService= categoryService;
    }

    // Create (Client et Admin)
    @PostMapping("/add")
    public CategoryDTO create(@RequestBody @Valid CategoryCreateForm form){

        return categoryService.create(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<CategoryDTO> getAll(){

        return categoryService.getAll();
    }

    // Read (User)
    @GetMapping("/{id:[0-9]+}/getone")
    public CategoryDTO getOne(@PathVariable long id){

        return categoryService.getOne(id);
    }


    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public CategoryDTO update(@RequestBody @Valid CategoryCreateForm form,@PathVariable long id){

        return categoryService.update(form,id);
    }


    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        categoryService.delete(id);
    }
}
