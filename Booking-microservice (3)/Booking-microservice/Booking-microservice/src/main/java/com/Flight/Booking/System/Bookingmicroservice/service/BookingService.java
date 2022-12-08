package com.Flight.Booking.System.Bookingmicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight.Booking.System.Bookingmicroservice.Entity.Booking;
import com.Flight.Booking.System.Bookingmicroservice.Repository.BookingRepository;

@Service
public class BookingService {

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


	public  Booking updatebookingid(Booking bookingid1) {
		return bookingRepository.save(bookingid1);
	}

	public void deleteBybookingid(int bookingid) {
		bookingRepository.deleteById(bookingid);
	}

}
