package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Registered_user;

public interface UserRepository extends JpaRepository<Registered_user,Long> {
}
