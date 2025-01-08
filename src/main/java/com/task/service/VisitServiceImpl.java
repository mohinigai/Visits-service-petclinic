package com.task.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.task.entity.Visit;
import com.task.repository.VisitRepository;
import com.task.response.Vets;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class VisitServiceImpl implements VisitServiceI {
 
	  private final Logger logger= LoggerFactory.getLogger(VisitServiceImpl.class);

	
	@Autowired
	private VisitRepository visitRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public static final String VISIT_SERVICE="visitService";

	@Override
	public Visit createvisit(Visit visit) {
		Visit save = visitRepository.save(visit);
		return save;
	}

	@Override
	public List<Visit> getAllVisit() {
		List<Visit> all = visitRepository.findAll();
		return all;
	}

	@Override
	public Visit singleVisit(Long visitId) {
		Visit byId = visitRepository.findById(visitId)
				.orElseThrow(() -> new RuntimeException("visit Id not found" + visitId));
		return byId;
	}

	@Override
	public Visit updateVisit(Visit visit, Long visitId) {
		Visit byId = visitRepository.findById(visitId)
				.orElseThrow(() -> new RuntimeException("visit Id not found" + visitId));
		byId.setDescription(visit.getDescription());
		byId.setAppointmentDate(visit.getAppointmentDate());
		byId.setAppointmentTime(visit.getAppointmentTime());
		Visit updateVisit = visitRepository.save(byId);
		return updateVisit;
	}

	@Override
	public void deletevisit(Long visitId) {
		Visit VistId = visitRepository.findById(visitId)
				.orElseThrow(() -> new RuntimeException("visit Id not found" + visitId));
		visitRepository.delete(VistId);

	}

	@CircuitBreaker(name = "visitService", fallbackMethod = "fallback")
	@Override
	public List<Visit> getAllCustomer(Long customerId) {
		List<Visit> byCustomerId = visitRepository.findByCustomerId(customerId);
		List<Visit> vlist = new ArrayList<>();
		for (Visit v : byCustomerId) {
			if (v.getVisitId() != null) {

				String url = "http://localhost:8082/vets/visit/" + v.getVisitId();
				Vets[] forObject = restTemplate.getForObject(url, Vets[].class);
				List<Vets> asList = Arrays.asList(forObject);
				v.setVetList(asList);
				vlist.add(v);
			}
		}
		return vlist;
	}

	public List<Visit> fallback(Long customerId, Throwable t) {
		// This method is invoked when the circuit is open or there is an exception.
		System.out.println("Fallback method triggered for customerId: " + customerId + ", exception: " + t);
		logger.info("Fallback is excuted because server is falldown", t.getMessage());
		return new ArrayList<>();   }
	
}
