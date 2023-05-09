package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Vehicle_status;

public interface StatusRepository extends JpaRepository<Vehicle_status,Long> {
}
