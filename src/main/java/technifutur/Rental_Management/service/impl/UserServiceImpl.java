package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.mapper.Mapper_user;
import technifutur.Rental_Management.model.dto.UserDTO;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.repository.UserRepository;
import technifutur.Rental_Management.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final Mapper_user mapperUser;

    @PersistenceContext
    private EntityManager entityManager;

    public UserServiceImpl(UserRepository userRepository, Mapper_user mapperUser) {
        this.userRepository = userRepository;
        this.mapperUser = mapperUser;
    }


    @Override
    @Transactional
    public UserDTO create(RegistrationForm form) {
        Registered_user registered_user = mapperUser.toRegisteredUserEntity(form);

        userRepository.save(registered_user);
        return mapperUser.toRegisteredUserDTO(registered_user);
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }

    @Override
    public UserDTO getOne(long id) {
        Registered_user registered_user = entityManager.find(Registered_user.class,id);
        return mapperUser.toRegisteredUserDTO(registered_user);
    }

    @Override
    public void update(long id) {

    }

    @Override
    public void delete(long id) {

    }
}
