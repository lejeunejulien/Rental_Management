package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Booking {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "booking_id", nullable = false)
        private Long id;

        //Validation à utiliser
        @Column
        private Boolean validation;

        @Column
        private String adress;

        /////////////
        @Column
        private LocalDateTime start_date;

        ////////////

        @Column
        private LocalDateTime arrival_date;

        ///////////

        @ManyToOne
        //@JoinColumn(nullable = false)
        private Registered_user registered_user;

        @ManyToOne
        //@JoinColumn(nullable = false)
        private Vehicle_properties vehicle_properties;
}
