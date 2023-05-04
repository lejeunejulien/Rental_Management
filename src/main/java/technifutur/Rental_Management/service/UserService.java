package technifutur.Rental_Management.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.UserDTO;
import technifutur.Rental_Management.model.form.UserCreateForm;

import java.util.List;

@Service
public interface UserService {
    static ResponseEntity<UserDTO> createUser(UserCreateForm form) {
    }

    static List<UserDTO> getAll() {
    }

    static void getOne(long id) {
    }

    static void update(long id) {
    }

    static void delete(long id) {
    }
}
