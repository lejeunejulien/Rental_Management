package technifutur.Rental_Management.model.form;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Vehicle_statusForm {

    private String status; // (Panne, Service, Entretien)

    private LocalDateTime start_date;

    private LocalDateTime end_date;
}
