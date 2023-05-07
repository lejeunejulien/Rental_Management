package technifutur.Rental_Management.model.form;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import technifutur.Rental_Management.model.entity.Price;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

import java.util.List;

public class CategoryCreateForm {


    private String brand;


    private String model;


    //private List<Vehicle_properties> list_vehicle_properties;

    //private Price price;
}
