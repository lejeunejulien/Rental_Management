package technifutur.Rental_Management.model.dto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceDTO {

    private Long id;
    private Double price_day;
    private Double price_weekend;
    private Double price_month;
    private Double caution;
    private LocalDateTime arrival_date;

}
