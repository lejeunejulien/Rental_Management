package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter @Setter
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id", nullable = false)
    private Long id;

    @Column
    private Double price_day;

    @Column
    private Double price_weekend;

    @Column
    private Double price_month;

    @Column
    private Double caution;

    @OneToMany(mappedBy = "price")
    private List<Category> list_category;
}
