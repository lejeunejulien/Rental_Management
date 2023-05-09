package technifutur.Rental_Management.model.form;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SupplierCreateForm {

    private String name;

    private String adress;

    private String tel;

    private Double purchase_price;
}
