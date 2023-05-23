package technifutur.Rental_Management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Registered_user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "registered_user")
    private List<Booking> list_bookings;

}
