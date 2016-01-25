package com.example.booking.resources;

import com.example.booking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Component
@Path("/bookings")
public final class BookingResource {
    @Autowired
    BookingRepository bookingRepository;

    @GET
    @Produces("application/json")
    public Response getOrder() {
        return Response.ok().entity(bookingRepository.findAll()).build();
    }
}
