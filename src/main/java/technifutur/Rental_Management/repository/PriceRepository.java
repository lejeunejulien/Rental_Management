package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Price;

public interface PriceRepository extends JpaRepository<Price,Long> {
}
