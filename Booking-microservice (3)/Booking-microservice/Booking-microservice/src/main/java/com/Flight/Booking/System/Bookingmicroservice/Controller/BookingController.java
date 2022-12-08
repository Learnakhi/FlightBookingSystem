package com.Flight.Booking.System.Bookingmicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Flight.Booking.System.Bookingmicroservice.Entity.Booking;
import com.Flight.Booking.System.Bookingmicroservice.service.BookingService;

@RestController
@RequestMapping("/tickets")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;

	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
    
	@GetMapping("/getallbookings")
	public List<Booking> findAllbooking() {
		return bookingService.findAllBookings();
		}
	
	@GetMapping("/{bookingid}")
	public Booking getByBookingId(@PathVariable int bookingid) {
		return bookingService.getByBookingId(bookingid);
     }
	
	@PostMapping("/booking")
	public Booking adding(@RequestBody Booking booking) {
	return bookingService.updatebookingid(booking);
	}
	
	@DeleteMapping("/delete/{bookingid}")  
	public void delete(@RequestBody int bookingid)   {
		bookingService.deleteBybookingid(bookingid);
	 
	}  
	
	@PutMapping("/update/{bookingid}")  
	public Booking update(@RequestBody  Booking bookingid1,@PathVariable int id)  {  
	return bookingService.updatebookingid(bookingid1);  
}
}
