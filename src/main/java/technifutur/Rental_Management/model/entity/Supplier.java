package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String adress;

    @Column
    private String tel;

    @Column
    private Double purchase_price;

    @OneToMany(mappedBy = "supplier")
    private List<Vehicle_properties> list_vehicle_properties;

}
