package com.example.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public final class BookingRestController {
    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping(value = "/bookings", method = RequestMethod.GET, produces = "application/json")
    Collection<Booking> bookings() {
        return bookingRepository.findAll();
    }
}
