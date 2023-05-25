package technifutur.Rental_Management.model.dto;

import lombok.Data;
import java.util.List;

@Data
public class Vehicle_propertiesDTO {
    private long id;
    private Double mileage;
    private Double year;
    private Double engine_power;
    private CategoryDTO category;
    private SupplierDTO supplier;
    private List<Vehicle_statusDTO> list_vehicle_status;
}
