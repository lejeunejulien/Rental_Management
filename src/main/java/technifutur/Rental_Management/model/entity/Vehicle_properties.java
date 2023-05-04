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

    @Column(nullable = false)
    private Double mileage;

    @Column(nullable = false)
    private Double year;

    @Column(nullable = false)
    private Double engine_power;

    @OneToMany(mappedBy = "vehicle_properties")
    private List<Booking> list_bookings;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Supplier supplier;

    @OneToMany(mappedBy = "vehicle_properties")
    private List<Vehicle_status> list_status_vehicle;
}
