package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Registered_user;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Registered_user,Long> {

    Optional<Registered_user> findByUsername(String username);
}
