package com.Flight.Booking.System.Faremicroservice.Service;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Flight.Booking.System.Faremicroservice.Entity.Booking;
import com.Flight.Booking.System.Faremicroservice.Entity.fares;
import com.Flight.Booking.System.Faremicroservice.Repository.FareRepository;


@Service
public class FareService {
	@Autowired
	private RestTemplate restTemplate;

   String url1="http://Bookingmicroservices/book";


@Autowired
    private FareRepository farerepository;

   public fares saveFares(fares fares1) {
       return farerepository.save(fares1);
  }

    public List<fares> getAllFares() {
        return farerepository.findAll();
    }

	public Optional<fares> findByFareId(int fareid) {
		return farerepository.findById(fareid);
	}


	public void deletefare(int fareid) {
		farerepository.deleteById(fareid);

	}

	public fares updateFaresId(fares faresid1) {
		return (fares) farerepository.save(faresid1);
	}

	public List<Booking> getAllbooking() {
		Booking[] booking=restTemplate.getForObject(url1+"/getallbookings",Booking[].class);
			return (Arrays.asList(booking));
	}



}
