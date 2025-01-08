package com.task.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.task.response.Vets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VISIT_DETAILS")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Visit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VISIT_ID")
	private Long visitId;

	@Column(name = "CUSTOMER_ID")
	private Long customerId;

	@Column(name = "VET_ID")
	private Long vetId;

	@Column(name="APPOINTMENT_DATE")
	private Date appointmentDate;
	
	@Column(name="APPOINTMENT_TIME")
	private String appointmentTime;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	
	@Transient
	private List<Vets> vetList;
	
}
