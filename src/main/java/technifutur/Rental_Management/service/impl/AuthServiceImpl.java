package technifutur.Rental_Management.service.impl;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.JWTHolderDTO.JWTHolderDTO;
import technifutur.Rental_Management.model.dto.AuthDTO;
import technifutur.Rental_Management.model.form.LoginForm;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.service.AuthService;

/*
@Service
public class AuthServiceImpl implements AuthService {


    private final AuthenticationManager authManager;
    private final JwtProvider jwtProvider;

    public AuthServiceImpl(AuthenticationManager authManager, JwtProvider jwtProvider) {
        this.authManager = authManager;
        this.jwtProvider = jwtProvider;
    }

    @Override
    public void register(RegistrationForm form) {

    }

    @Override
    public AuthDTO login(LoginForm form) {
        Authentication auth = new UsernamePasswordAuthenticationToken( form.getUsername(), form.getPassword() );
        auth = authManager.authenticate(auth);
        return new AuthDTO(auth.getName(), jwtProvider.createToken(auth));
    }
}

 */
