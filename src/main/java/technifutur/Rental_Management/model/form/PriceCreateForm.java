package technifutur.Rental_Management.model.form;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import technifutur.Rental_Management.model.entity.Category;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PriceCreateForm {

    private Double price_day;

    private Double price_weekend;

    private Double price_month;

    private Double caution;

    private LocalDateTime arrival_date;

}
