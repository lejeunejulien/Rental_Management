package technifutur.Rental_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

public interface VehiclePropertiesRepository extends JpaRepository<Vehicle_properties,Long> {


}
