package technifutur.Rental_Management.model.form;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Vehicle_statusForm {

    private String status; // (Panne, Service, Entretien)

    private LocalDate start_date;

    private LocalTime start_time;

    private LocalDate end_date;

    private LocalTime end_time;
}
