package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.service.VehiclePropertiesService;

import java.util.List;

public class VehiclePropertiesController {

    // Create (Admin)
    @PostMapping("/add")
    public ResponseEntity<BookingDTO> creation_reservation(@RequestBody @Valid BookingCreateForm form){
        return VehiclePropertiesService.createVehicleProperties(form);
    }

    // Read (Admin et User)
    @GetMapping("/getall")
    public List<BookingDTO> getAll(){
        return VehiclePropertiesService.getAll();
    }

    // Read (Admin et User)
    @GetMapping("{id:[0-9]+/getone}")
    public void getOne(@PathVariable long id){
        VehiclePropertiesService.getOne(id);
    }

    // Admin
    @PatchMapping("{id:[0-9]+/update}")
    public void update(@PathVariable long id){

        VehiclePropertiesService.update(id);
    }

    // Admin
    @DeleteMapping("{id:[0-9]+/delete}")
    public void delete(@PathVariable long id){
        VehiclePropertiesService.delete(id);
    }


}
