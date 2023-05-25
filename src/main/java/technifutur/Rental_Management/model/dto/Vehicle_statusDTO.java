package technifutur.Rental_Management.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Vehicle_statusDTO {
    private Long id;
    private String status;
    private LocalDateTime start_date;
    private LocalDateTime end_date;

}
