package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.SupplierDTO;
import technifutur.Rental_Management.model.form.SupplierCreateForm;
import technifutur.Rental_Management.service.SupplierService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService){

        this.supplierService=supplierService;
    }

    // Admin
    @PostMapping("/add")
    public SupplierDTO create(@RequestBody @Valid SupplierCreateForm form){

        return supplierService.create(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<SupplierDTO> getAll(){

        return supplierService.getAll();
    }


    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public SupplierDTO update(@RequestBody @Valid SupplierCreateForm form, @PathVariable long id){

        return supplierService.update(form,id);
    }


    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        supplierService.delete(id);
    }


}
