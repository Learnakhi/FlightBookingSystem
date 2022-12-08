//package com.Flight.Booking.System.Bookingmicroservice;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.Flight.Booking.System.Entity.Booking;
//import com.Flight.Booking.System.Repository.BookingRepository;
//import com.Flight.Booking.System.service.BookingService;
//@SpringBootTest
//class FaresMicroserviceApplicationTests {
//
//	@Autowired
//	private BookingService searchService;
//	
//	@MockBean
//	private BookingRepository searchRepository;
//	
//	public void getBookingTest() {
//		when(BookingRepository.findAll())
//		.thenReturn((List<booking>) Stream
//				.of(new booking("1", "Airline","5/12/22","warangal","guntur", "2000"),
//						new booking("2", "go first","11/12/22","vijyanagram","odisha", "8990"))
//				.collect(Collectors.toList()));
//		
//		assertEquals(2, searchService.getAllBookings().size());
//	}
//	
//	@Test
//	public void saveBookingTest() {
//		 booking = new booking("3", "indigo","3/12/22","warangal","kakinada", "4355");
//		when(bookingRepository.save(booking)).thenReturn(booking);
//		assertEquals(booking, bookingService.bookingSearch(booking));	
//	}
//	/*@Test
//	public void deleteUserTest() {
//		search search1 = new search("3", "indigo","3/12/22","warangal","kakinada", "4355");
//		String id = (String) toString() ;
//		searchService.deleteSearch(id);
//		assert(search1,searchService.deleteSearch(id));
//	}*/
//
//
//}
