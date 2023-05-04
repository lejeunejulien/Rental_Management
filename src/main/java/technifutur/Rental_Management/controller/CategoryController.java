package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.model.form.CategoryCreateForm;
import technifutur.Rental_Management.service.BookingService;
import technifutur.Rental_Management.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){

        this.categoryService= categoryService;
    }

    // Create (Client et Admin)
    @PostMapping("/add")
    public ResponseEntity<BookingDTO> creation_category(@RequestBody @Valid CategoryCreateForm form){
        return categoryService.createCategory(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<CategoryDTO> getAll(){

        return categoryService.getAll();
    }

    // Read (User)
    @GetMapping("{id:[0-9]+/getone}")
    public void getOne(@PathVariable long id){

        categoryService.getOne(id);
    }


    // Admin
    @PatchMapping("{id:[0-9]+/update}")
    public void update(@PathVariable long id){

        categoryService.update(id);
    }


    // Admin
    @DeleteMapping("{id:[0-9]+/delete}")
    public void delete(@PathVariable long id){

        categoryService.delete(id);
    }
}
