package com.task.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.Visit;
import com.task.service.VisitServiceI;
import com.task.util.ApiResponse;

@RestController
public class VisitController {
	
	  private final Logger logger= LoggerFactory.getLogger(VisitController.class);


	@Autowired
	private VisitServiceI visitserviceI;

	@PostMapping("/visits")
	ResponseEntity<Visit> createVisit(@RequestBody Visit visit) {
	       logger.info("Entering the request for save Visit data");
		Visit createvisit = visitserviceI.createvisit(visit);
		return new ResponseEntity<Visit>(createvisit, HttpStatus.CREATED);

	}

	@GetMapping("/visits")
	ResponseEntity<List<Visit>> getAllvisit() {
		List<Visit> allVisit = visitserviceI.getAllVisit();
		return new ResponseEntity<List<Visit>>(allVisit, HttpStatus.OK);

	}

	@GetMapping("/visits/{id}")
	ResponseEntity<Visit> getSinglev(@PathVariable("id") Long visitId) {
	       logger.info("Entering the request for get Visit data with visitId {} " , visitId);
		Visit singleVisit = visitserviceI.singleVisit(visitId);
	       logger.info("completed the request for get Visit data with visitId {} " , visitId);
		return new ResponseEntity<Visit>(singleVisit, HttpStatus.OK);
	}

	@PutMapping("/visits/{id}")
	ResponseEntity<Visit> updatedVisit(@RequestBody Visit visit, @PathVariable("id") Long visitId) {
		Visit updateVisit = visitserviceI.updateVisit(visit, visitId);
		return new ResponseEntity<Visit>(updateVisit, HttpStatus.CREATED);
	}

	@DeleteMapping("/visits/{id}")
	ResponseEntity<ApiResponse> deletevisit(@PathVariable("id") Long visitId) {
		visitserviceI.deletevisit(visitId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Visit Id deleted successfull", true), HttpStatus.OK);
	}

	@GetMapping("/visits/customer/{id}")
	ResponseEntity<List<Visit>>getAllCustomers(@PathVariable ("id") Long customerId) {
		List<Visit> allCustomer = visitserviceI.getAllCustomer(customerId);
		return new ResponseEntity<List<Visit>>(allCustomer,HttpStatus.OK);
	}
}
