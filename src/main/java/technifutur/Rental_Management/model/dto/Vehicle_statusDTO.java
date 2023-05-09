package technifutur.Rental_Management.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Vehicle_statusDTO {

    private String status;
    private String start_date;
    private LocalDateTime end_date;
}
