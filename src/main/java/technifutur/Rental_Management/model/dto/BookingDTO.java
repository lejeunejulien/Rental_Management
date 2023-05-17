package technifutur.Rental_Management.model.dto;

import lombok.Data;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class BookingDTO {

    //private Boolean validation; //-> définit par admin
    private String adress;
    private LocalDate start_date;
    private LocalTime start_time;
    private LocalDate arrival_date;
    private LocalTime arrival_time;
    private Registered_user registered_user; //configuration de la sécurité au préalable
    private Vehicle_properties vehicle_properties;  // -> voir croquis

}
