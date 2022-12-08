package com.springboot.searchmicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.searchmicroservice.entity.Booking;
import com.springboot.searchmicroservice.entity.search;
import com.springboot.searchmicroservice.repository.SearchRepository;
import com.springboot.searchmicroservice.service.SearchService;

import io.micrometer.core.instrument.search.Search;

@RestController
@RequestMapping("/see")
public class SearchController {

	@Autowired
	private SearchService service;

	@PostMapping("/flightSearch")
	public search adding(@RequestBody search search1) {
		return service.saveSearch(search1);
	}

	//@PostMapping("/addflight")
	//public search flightSearch1(@RequestBody search search1) {
		//return service.savesearch(search1);
	//}

	@GetMapping("/{id}")
	public Optional<search> flightSearch2(@PathVariable String id) {
		return service.getSearchById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void flightSearch3(@PathVariable String id) {
      service.deleteSearch(id);
	}

	@PutMapping("/update/{id}")
	public search flightSearch(@RequestBody search search1,@PathVariable String id) {
		return service.updateSearch(search1);
	}
	@GetMapping("getallsearches")
	public List<search> getAllsearch()
	{
		return service.getAllSearches();
	}

	@GetMapping("/seebookings")
	public List<Booking> getAllBookings(){
		return service.getAllbooking();
	}

}

