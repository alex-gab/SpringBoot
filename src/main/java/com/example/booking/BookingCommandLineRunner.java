package com.example.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public final class BookingCommandLineRunner implements CommandLineRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Override
    public void run(String... strings) throws Exception {
        for (Booking b : bookingRepository.findAll()) {
            System.out.println(b.toString());
        }
    }

}
