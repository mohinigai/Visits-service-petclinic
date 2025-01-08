package com.task.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vets {

	private Long vetId;
	
	private String firstName;

	private String lastName;

	private String specialty;
    
	private String qualification;

	private String totalExpirence;

	private String address;

	

}
