package technifutur.Rental_Management.model.dto;

import lombok.Data;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

import java.time.LocalDateTime;

@Data
public class BookingDTO {

    //private Boolean validation; //-> définit par admin
    private String adress;
    private LocalDateTime start_date;
    private LocalDateTime arrival_date;
    private Registered_user registered_user; //configuration de la sécurité au préalable
    private Vehicle_properties vehicle_properties;  // -> voir croquis

}
