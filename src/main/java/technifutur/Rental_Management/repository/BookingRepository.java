package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
