package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Vehicle_properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_properties_id", nullable = false)
    private Long id;

    @Column
    private Double mileage;

    @Column
    private Double year;

    @Column
    private Double engine_power;

    @OneToMany(mappedBy = "vehicle_properties")
    private List<Booking> list_bookings;

    @ManyToOne
    //@JoinColumn(nullable = false)
    private Category category;

    @ManyToOne
    //@JoinColumn(nullable = false)
    private Supplier supplier;

    @OneToMany(mappedBy = "vehicle_properties")
    private List<Vehicle_status> list_status_vehicle;
}
