package technifutur.Rental_Management.model.dto;

import lombok.Data;
import java.util.List;

@Data
public class Vehicle_propertiesDTO_User {
    private long id;
    private Double mileage;
    private Double year;
    private Double engine_power;
    private CategoryDTO category;
}
