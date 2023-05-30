package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.exception.RessourceNotFoundException;
import technifutur.Rental_Management.model.dto.AuthDTO;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.form.LoginForm;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.repository.UserRepository;
import technifutur.Rental_Management.service.AuthService;
import technifutur.Rental_Management.service.UserService;


@Service
public class AuthServiceImpl implements AuthService {

    /*
    private final AuthenticationManager authManager;
    private final JwtProvider jwtProvider;

    @PersistenceContext
    private EntityManager entityManager;

    public AuthServiceImpl(AuthenticationManager authManager, JwtProvider jwtProvider, UserService userService, UserRepository userRepository) {
        this.authManager = authManager;
        this.jwtProvider = jwtProvider;

    }

    */

    @Override
    public void register(RegistrationForm form) {

    }

    @Override
    public AuthDTO login(LoginForm form) {
        /*

        Authentication auth = new UsernamePasswordAuthenticationToken( form.getUsername(), form.getPassword() );
        auth = authManager.authenticate(auth);

        //Recherche id de l'utilisateur
        Registered_user registered_user = entityManager.find(Registered_user.class,form.getUsername());
        long id = registered_user.getId();

        //Recherche du role -> Un role par utilisateur
        string role  = registered_user.getRoles().toArray()[0];


        Category category = categoryRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);
        return new AuthDTO(auth.getName(), jwtProvider.createToken(auth), id, role);

        */

        return null;
    }
}


