package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.form.PriceCreateForm;
import technifutur.Rental_Management.service.PriceService;


@RestController
@RequestMapping("/price")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService){

        this.priceService= priceService;
    }

    // Create (Client et Admin)
    @PostMapping("/add")
    public void create(@RequestBody @Valid PriceCreateForm form){

        priceService.create(form);
    }


    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public void update(@PathVariable long id){

        priceService.update(id);
    }


    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        priceService.delete(id);
    }

}
