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
public class Vehicle_status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_satus_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String status;

    ///////////
    @Column(nullable = false)
    private LocalDate start_date;

    @Column(nullable = false)
    private LocalTime start_time;

    ///////////
    @Column(nullable = false)
    private LocalDate end_date;

    @Column(nullable = false)
    private LocalTime end_time;
    //////////

    @ManyToOne
    @JoinColumn(nullable = false)
    private Vehicle_properties vehicle_properties;

}
