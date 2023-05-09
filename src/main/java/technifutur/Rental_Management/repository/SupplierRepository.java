package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {

}
