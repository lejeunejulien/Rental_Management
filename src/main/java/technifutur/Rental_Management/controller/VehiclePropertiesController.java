package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;
import technifutur.Rental_Management.service.VehiclePropertiesService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehicle_properties")
public class VehiclePropertiesController {

    private final VehiclePropertiesService vehiclePropertiesService;

    public VehiclePropertiesController(VehiclePropertiesService vehiclePropertiesService){
        this.vehiclePropertiesService = vehiclePropertiesService;
    }

    // Create (Admin)
    @PostMapping("/add")
    public ResponseEntity<Vehicle_propertiesDTO> create(@RequestBody @Valid VehiclePropertiesCreateForm form){

        return ResponseEntity.ok(vehiclePropertiesService.create(form));
    }

    // Read (Admin et User)
    @GetMapping("/getall")
    public List<Vehicle_propertiesDTO> getAll(){

        return vehiclePropertiesService.getAll();
    }

    // Read (Admin et User)
    @GetMapping("/{id:[0-9]+}/getone")
    public Vehicle_propertiesDTO getOne(@PathVariable long id){

        return vehiclePropertiesService.getOne(id);
    }

    //@RequestBody Book bookToUpdate, @PathVariable("id") int id

    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public Vehicle_propertiesDTO update(@RequestBody @Valid VehiclePropertiesCreateForm form, @PathVariable Long id){

        return vehiclePropertiesService.update(form,id);
    }

    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        vehiclePropertiesService.delete(id);
    }


}
