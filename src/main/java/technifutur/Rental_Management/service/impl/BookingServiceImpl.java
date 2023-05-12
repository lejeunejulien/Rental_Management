package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.mapper.Mapper_booking;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;
import technifutur.Rental_Management.repository.BookingRepository;
import technifutur.Rental_Management.repository.UserRepository;
import technifutur.Rental_Management.repository.VehiclePropertiesRepository;
import technifutur.Rental_Management.service.BookingService;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final UserRepository userRepository;

    private final VehiclePropertiesRepository vehiclePropertiesRepository;

    private final Mapper_booking mapperBooking;

    private final BookingRepository bookingRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public BookingServiceImpl(UserRepository userRepository,
                              VehiclePropertiesRepository vehiclePropertiesRepository,
                              Mapper_booking mapperBooking,
                              BookingRepository bookingRepository){

        this.userRepository = userRepository;
        this.vehiclePropertiesRepository= vehiclePropertiesRepository;
        this.mapperBooking = mapperBooking;
        this.bookingRepository=bookingRepository;
    }

    @Transactional
    @Override
    public BookingDTO create(BookingCreateForm form) {

        // CREATION ENTITY et insertion d'une partie des valeurs du form dans l'entity
        Booking booking = mapperBooking.toBookingEntity(form);

        Registered_user registered_user = entityManager.find(Registered_user.class,form.getId_registered_user());

        Vehicle_properties vehicle_properties = entityManager.find(Vehicle_properties.class,form.getId_vehicle_properties());

        booking.setRegistered_user(registered_user);
        booking.setVehicle_properties(vehicle_properties);

        bookingRepository.save(booking);

        return mapperBooking.toBookingDTO(booking);
    }

    @Transactional
    @Override
    public List<BookingDTO> getAll() {
        List<BookingDTO> list_booking_getAll = bookingRepository.findAll().stream()
                .map(mapperBooking::toBookingDTO)
                .toList();
        return list_booking_getAll;
    }

    @Transactional
    @Override
    public BookingDTO getOne(long id) {
        Booking booking = entityManager.find(Booking.class,id);
        return mapperBooking.toBookingDTO(booking);
    }

    @Transactional
    @Override
    public void delete(long id) {
        bookingRepository.deleteById(id);
    }

    @Transactional
    @Override
    public BookingDTO update(BookingCreateForm form,long id) {
        Booking booking = entityManager.find(Booking.class,id);

        Registered_user registered_user = entityManager.find(Registered_user.class,form.getId_registered_user());
        Vehicle_properties vehicle_properties = entityManager.find(Vehicle_properties.class,form.getId_vehicle_properties());

        booking.setRegistered_user(registered_user);
        booking.setVehicle_properties(vehicle_properties);

        booking.setAdress(form.getAdress());
        booking.setArrival_date(form.getArrival_date());
        booking.setStart_date(form.getStart_date());

        entityManager.persist(booking);

        return mapperBooking.toBookingDTO(booking);
    }
}
