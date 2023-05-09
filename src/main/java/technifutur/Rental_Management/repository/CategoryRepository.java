package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
