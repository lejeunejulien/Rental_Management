package technifutur.Rental_Management.model.form;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.entity.Category;
import technifutur.Rental_Management.model.entity.Supplier;
import technifutur.Rental_Management.model.entity.Vehicle_status;

import java.util.List;

@Data
public class VehiclePropertiesCreateForm {

    private Double mileage;

    private Double year;

    private Double engine_power;

    //private List<Booking> list_bookings; -> si on veut ajouter une réservation on utilisera "booking"

    private long id_category; // Il y aura eu un getAll de category avant et une sélection de la category (id via frontend)

    private long id_supplier; // Idem supplier

    private List<Vehicle_statusForm> list_status_vehicle;  // Liste fournie avant via une requête
}
