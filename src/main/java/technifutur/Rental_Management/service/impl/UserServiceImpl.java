package technifutur.Rental_Management.service.impl;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.UserDTO;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void create(RegistrationForm form) {

    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }

    @Override
    public UserDTO getOne(long id) {
        return null;
    }

    @Override
    public void update(long id) {

    }

    @Override
    public void delete(long id) {

    }
}
