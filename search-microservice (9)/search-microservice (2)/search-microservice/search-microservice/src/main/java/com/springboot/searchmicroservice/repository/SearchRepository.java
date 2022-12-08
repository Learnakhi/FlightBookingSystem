package com.springboot.searchmicroservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springboot.searchmicroservice.entity.search;

import io.micrometer.core.instrument.search.Search;

public interface SearchRepository extends MongoRepository <search, String> {

	Object save(Search search);

	// public search save(String id);

//	@Query("{origin:?0), (destination: ?1")
	//List<Search> findBySort(String origin, String destination);

	
	}

	



