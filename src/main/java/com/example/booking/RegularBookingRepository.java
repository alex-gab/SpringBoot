package com.example.booking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


public abstract class RegularBookingRepository implements BookingRepository {
    @Override
    public Collection<Booking> findByBookingName(String bookingName) {
        Collection<Booking> result = new ArrayList<>();
        for (Booking booking : this.findAll()) {
            if (Objects.equals(booking.getBookingName(), bookingName)) {
                result.add(booking);
            }
        }
        return result;
    }
}
