package technifutur.Rental_Management.service;

import technifutur.Rental_Management.model.dto.UserDTO;
import technifutur.Rental_Management.model.form.RegistrationForm;

import java.util.List;

public interface UserService {

    UserDTO create(RegistrationForm form);

    List<UserDTO> getAll();

    UserDTO getOne(long id);

    void update(long id);


    void delete(long id);


}
