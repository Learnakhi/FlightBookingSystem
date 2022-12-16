package com.Flight.Booking.System.Faremicroservice.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Flight.Booking.System.Faremicroservice.Entity.fares;

@Repository
public interface FareRepository extends MongoRepository<fares,String> {

	void deleteById(int fareid);

	Optional<fares> findById(int fareid);



	

		
	
	
}