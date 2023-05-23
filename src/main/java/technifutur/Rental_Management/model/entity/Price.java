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

    @Column(nullable = false)
    private Double price_day;

    @Column(nullable = false)
    private Double price_weekend;

    @Column(nullable = false)
    private Double price_month;

    @Column(nullable = false)
    private Double caution;

    @OneToMany(mappedBy = "price")
    private List<Category> list_category;
}
