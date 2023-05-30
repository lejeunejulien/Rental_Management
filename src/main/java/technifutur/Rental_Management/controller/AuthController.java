package technifutur.Rental_Management.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technifutur.Rental_Management.model.dto.AuthDTO;
import technifutur.Rental_Management.model.form.LoginForm;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.service.AuthService;


@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){

        this.authService= authService;
    }

    //Register
    @PostMapping("/register")
    public void register(@RequestBody @Valid RegistrationForm form){

        authService.register(form);
    }


    //Sign-in
    @PostMapping("/sign_in")
    public AuthDTO login(@RequestBody @Valid LoginForm form){

        return authService.login(form);
    }

}
