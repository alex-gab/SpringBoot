package com.example.booking.repositories;

import com.example.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Collection<Booking> findByBookingName(String bookingName);
}
