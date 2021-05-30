package com.sanbhu.spring.microservices.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanbhu.spring.microservices.limits.configuration.LimitServiceConfiguration;
import com.sanbhu.spring.microservices.limits.dto.Limits;

/**
 * The Class LimitController.
 */
@RestController
public class LimitController {

	/** The configuration. */
	@Autowired
	LimitServiceConfiguration configuration;
	
	/**
	 * Fetch limits.
	 *
	 * @return the limits
	 */
	@GetMapping("/limits")
	public Limits fetchLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		//return new Limits(10,1000);
	}
}
