package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Vehicle_status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_satus_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String start_date;

    @Column(nullable = false)
    private LocalDateTime end_date;

    @ManyToOne
    private Vehicle_properties vehicle_properties;

}
