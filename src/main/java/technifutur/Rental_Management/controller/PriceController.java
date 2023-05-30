package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.form.PriceCreateForm;
import technifutur.Rental_Management.service.PriceService;


@RestController
@CrossOrigin("*")
@RequestMapping("/price")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService){

        this.priceService= priceService;
    }

    // Create (Client et Admin)
    @PostMapping("/add")
    public PriceDTO create(@RequestBody @Valid PriceCreateForm form){

        return priceService.create(form);
    }


    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public PriceDTO update(@RequestBody @Valid PriceCreateForm form, @PathVariable long id){

        return priceService.update(form,id);
    }


    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        priceService.delete(id);
    }

}
