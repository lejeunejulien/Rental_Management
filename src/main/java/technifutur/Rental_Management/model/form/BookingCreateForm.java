package technifutur.Rental_Management.model.form;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


import java.time.LocalDateTime;

public class BookingCreateForm {

    // private Boolean validation; -> admin

    @NotNull
    private String adress;

    @NotNull
    private LocalDateTime start_date;

    @NotNull
    private LocalDateTime arrival_date;

    //private long id_registered_user;

    private long id_vehicle_properties;  //id_vehicle_properties (via frontend) -> getAll "vehicle_properties" a été effectué juste avant
    // on peut créer le "vehicle_properties"
}
