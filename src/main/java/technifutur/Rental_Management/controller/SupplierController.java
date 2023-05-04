package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.dto.SupplierDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.model.form.SupplierCreateForm;
import technifutur.Rental_Management.service.SupplierService;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService){
        this.supplierService=supplierService;
    }

    // Admin
    @PostMapping("/add")
    public ResponseEntity<SupplierDTO> creation_supplier(@RequestBody @Valid SupplierCreateForm form){
        return supplierService.createSupplier(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<SupplierDTO> getAll(){

        return supplierService.getAll();
    }


    // Admin
    @PatchMapping("{id:[0-9]+/update}")
    public void update(@PathVariable long id){

        supplierService.update(id);
    }


    // Admin
    @DeleteMapping("{id:[0-9]+/delete}")
    public void delete(@PathVariable long id){

        supplierService.delete(id);
    }


}
