package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.UserDTO;
import technifutur.Rental_Management.model.form.UserCreateForm;
import technifutur.Rental_Management.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){

        this.userService=userService;
    }

    // Create (Client et Admin)
    @PostMapping("/add")
    public void create(@RequestBody @Valid UserCreateForm form){

        userService.create(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<UserDTO> getAll(){

        return userService.getAll();
    }

    // Read (User)
    @GetMapping("/{id:[0-9]+}/getone")
    public UserDTO getOne(@PathVariable long id) {

        return userService.getOne(id);
    }

    // Admin
    @PatchMapping("/{id:[0-9]+}/update")
    public void update(@PathVariable long id){

        userService.update(id);
    }

    // Admin
    @DeleteMapping("/{id:[0-9]+}/delete")
    public void delete(@PathVariable long id){

        userService.delete(id);
    }

}
