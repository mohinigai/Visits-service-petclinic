package com.task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.entity.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long>{
 
	List<Visit> findByVetId (Long vetId);
	
	List<Visit>findByCustomerId(Long customerId);

	
}
