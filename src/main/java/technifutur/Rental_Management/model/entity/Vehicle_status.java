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

    @Column
    private String status;

    ///////////
    @Column
    private LocalDateTime start_date;

    ///////////
    @Column
    private LocalDateTime end_date;

    //////////

    @ManyToOne
    //@JoinColumn(nullable = false)
    private Vehicle_properties vehicle_properties;

}
