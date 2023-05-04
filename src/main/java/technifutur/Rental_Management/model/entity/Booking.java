package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Booking {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "booking_id", nullable = false)
        private Long id;

        @Column(nullable = false)
        private Boolean validation;

        @Column(nullable = false)
        private String adress;

        @Column(nullable = false)
        private LocalDateTime start_date;

        @Column(nullable = false)
        private LocalDateTime arrival_date;

        @ManyToOne
        private Registered_user registered_user;

        @ManyToOne
        private Vehicle_properties vehicle_properties;
}
