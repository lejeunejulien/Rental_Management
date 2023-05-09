package technifutur.Rental_Management.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class CategoryDTO {

    private String brand;
    private String model;
    private PriceDTO price;
}
