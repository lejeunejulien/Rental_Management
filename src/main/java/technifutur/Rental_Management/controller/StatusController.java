package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.dto.Vehicle_statusDTO;
import technifutur.Rental_Management.model.form.CategoryCreateForm;
import technifutur.Rental_Management.model.form.Vehicle_statusForm;
import technifutur.Rental_Management.service.CategoryService;
import technifutur.Rental_Management.service.StatusService;

import java.util.List;


@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService){

        this.statusService=statusService;
    }

    // Create (Admin)
    @PostMapping("/add")
    public Vehicle_statusDTO create(@RequestBody @Valid Vehicle_statusForm form){

        return statusService.create(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<Vehicle_statusDTO> getAll(){

        return statusService.getAll();
    }

    // Read (Admin)
    @GetMapping("/{id:[0-9]+}/getone")
    public Vehicle_statusDTO getOne(@PathVariable long id){

        return statusService.getOne(id);
    }


    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public Vehicle_statusDTO update(@RequestBody @Valid Vehicle_statusForm form,@PathVariable long id){

        return statusService.update(form,id);
    }


    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        statusService.delete(id);
    }
}
