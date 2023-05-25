package technifutur.Rental_Management.model.form;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
public class BookingCreateForm {

    //private Boolean validation; //-> définit par admin

    private String adress;

    private LocalDateTime start_date;

    private LocalDateTime arrival_date;

    private long id_registered_user; //configuration de la sécurité au préalable

    private long id_vehicle_properties;  // -> voir croquis
}
