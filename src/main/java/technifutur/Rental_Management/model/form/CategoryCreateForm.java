package technifutur.Rental_Management.model.form;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import technifutur.Rental_Management.model.entity.Price;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

import java.util.List;

@Data
public class CategoryCreateForm {

    private String brand;

    private String model;

    private long id_price;

}
