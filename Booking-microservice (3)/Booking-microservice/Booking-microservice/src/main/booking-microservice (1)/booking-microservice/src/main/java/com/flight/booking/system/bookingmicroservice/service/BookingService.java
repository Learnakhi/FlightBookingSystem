package com.flight.booking.system.bookingmicroservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.flight.booking.system.bookingmicroservice.entity.Booking;
import com.flight.booking.system.bookingmicroservice.entity.Checkin;
import com.flight.booking.system.bookingmicroservice.repository.BookingRepository;

@Service
public class BookingService {

	/*
	 * @Autowired private RestTemplate restTemplate;
	 * 
	 * String url1="http://checkinmicroservices/checkin";
	 * 
	 */
   @Autowired
    private  BookingRepository bookingRepository ;

   public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
    
    public  List<Booking> findAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getByBookingId(int bookingid) {
        return bookingRepository.findById(bookingid).get();
    }


    public void deletebooking(int id) {
        bookingRepository.deleteById(id);
        
    }

   public Booking updatebooking(Booking bookingid) {
        return  bookingRepository.save(bookingid);
   }
        public Booking addbooking(Booking booking) {
    		return bookingRepository.save(booking);
    	}

    	public void deletebookingById(int bookingid) {
    		bookingRepository.deleteById(bookingid);
    	}

    	public Booking deletebooking(Booking booking) {
    		return bookingRepository.save(booking);
    	}

		/*
		 * public List<Booking> getAllbooking() { return
		 * bookingRepository.getallbookings(); }
		 */
		
		/*
		 * public Checkin checkin(@RequestBody Checkin checkin,@PathVariable("lastName")
		 * String lastName1) { Checkin[] checkin1
		 * =restTemplate.getForObject(url1+"/updateallcheckins",Checkin[].class); return
		 * (Checkin) (Arrays.asList(checkin)); }
		 * 
		 * public Checkin updatelastName() { // TODO Auto-generated method stub return
		 * null; }
		 */
		

   }
