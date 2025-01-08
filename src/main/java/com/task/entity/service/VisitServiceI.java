package com.task.entity.service;

import java.util.List;

import com.task.entity.Visit;

public interface VisitServiceI {
	
	Visit createvisit(Visit visit);
  
	List<Visit> getAllVisit();
	
	Visit singleVisit(Long visitId);
	
	Visit updateVisit(Visit visit, Long visitId);
	
	void deletevisit(Long visitId);
	
	List<Visit> getAllCustomer(Long customerId);
	
    public List<Visit> fallback(Long customerId, Throwable t);
}
