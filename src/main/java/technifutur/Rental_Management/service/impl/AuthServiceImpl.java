package technifutur.Rental_Management.service.impl;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.JWTHolderDTO.JWTHolderDTO;
import technifutur.Rental_Management.model.form.LoginForm;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {


    @Override
    public void register(RegistrationForm form) {

    }

    @Override
    public JWTHolderDTO login(LoginForm form) {

        return null;
    }
}
