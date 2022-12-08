package com.Flight.Booking.System.Bookingmicroservice.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Flight.Booking.System.Bookingmicroservice.Entity.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer>{	
    
}
