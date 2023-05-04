package technifutur.Rental_Management.service;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.JWTHolderDTO.JWTHolderDTO;
import technifutur.Rental_Management.model.form.LoginForm;
import technifutur.Rental_Management.model.form.RegistrationForm;

@Service
public interface AuthService {
    void register(RegistrationForm form);

    JWTHolderDTO login(LoginForm form);
}
