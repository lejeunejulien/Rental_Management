package technifutur.Rental_Management.model.dto;

import lombok.Data;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

import java.util.List;

@Data
public class SupplierDTO {
    private long id;
    private String name;
    private String adress;
    private String tel;
    private Double purchase_price;

}
