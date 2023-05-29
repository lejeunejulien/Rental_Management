package technifutur.Rental_Management.service;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.JWTHolderDTO.JWTHolderDTO;
import technifutur.Rental_Management.model.dto.AuthDTO;
import technifutur.Rental_Management.model.form.LoginForm;
import technifutur.Rental_Management.model.form.RegistrationForm;


public interface AuthService {
    void register(RegistrationForm form);

    AuthDTO login(LoginForm form);
}
