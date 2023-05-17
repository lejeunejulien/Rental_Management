package technifutur.Rental_Management.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Vehicle_statusDTO {

    private String status;
    private LocalDate start_date;
    private LocalTime start_time;
    private LocalDate end_date;
    private LocalTime end_time;
}
