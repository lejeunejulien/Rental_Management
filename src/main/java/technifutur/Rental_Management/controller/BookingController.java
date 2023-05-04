package technifutur.Rental_Management.controller;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }

    // Create (Client et Admin)
    @PostMapping("/add")
    public ResponseEntity<BookingDTO> creation_reservation(@RequestBody @Valid BookingCreateForm form){
        return bookingService.createBooking(form);
    }

    // Read (Admin)
    @GetMapping("/getall")
    public List<BookingDTO> getAll(){
        return bookingService.getAll();
    }

    // Read (User)
    @GetMapping("{id:[0-9]+/getone}")
    public void getOne(@PathVariable long id){
        bookingService.getOne(id);
    }


    // Update si user-> check que l'id correspond à son propre id
    @PatchMapping("{id:[0-9]+/update}")
    public void update(@PathVariable long id){
        bookingService.update(id);
    }


    // Delete si user-> check que l'id correspond à son propre id
    @DeleteMapping("{id:[0-9]+/delete}")
    public void delete(@PathVariable long id){
        bookingService.delete(id);
    }
}
