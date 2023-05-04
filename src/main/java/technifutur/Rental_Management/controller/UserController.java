package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<UserDTO> creation_user(@RequestBody @Valid UserCreateForm form){
        return UserService.createUser(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<UserDTO> getAll(){

        return UserService.getAll();
    }

    // Read (User)
    @GetMapping("{id:[0-9]+/getone}")
    public void getOne(@PathVariable long id){

        UserService.getOne(id);
    }


    // Admin
    @PatchMapping("{id:[0-9]+/update}")
    public void update(@PathVariable long id){

        UserService.update(id);
    }


    // Admin
    @DeleteMapping("{id:[0-9]+/delete}")
    public void delete(@PathVariable long id){

        UserService.delete(id);
    }



}
