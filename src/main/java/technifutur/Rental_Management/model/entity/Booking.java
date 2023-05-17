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

        @Column
        private Boolean validation;

        @Column(nullable = false)
        private String adress;

        @Column(nullable = false)
        private LocalDateTime start_date;

        @Column(nullable = false)
        private LocalDateTime arrival_date;

        @ManyToOne
        @JoinColumn(nullable = false)
        private Registered_user registered_user;

        @ManyToOne
        @JoinColumn(nullable = false)
        private Vehicle_properties vehicle_properties;
}
