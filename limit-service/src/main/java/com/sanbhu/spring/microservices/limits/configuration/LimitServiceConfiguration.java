package com.sanbhu.spring.microservices.limits.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The Class LimitServiceConfiguration.
 */
@Configuration
@ConfigurationProperties("limit-service")
public class LimitServiceConfiguration {
	
	/** The minimum. */
	private int minimum;
	
	/** The maximum. */
	private int maximum;
	
	/**
	 * Instantiates a new limit service configuration.
	 */
	public LimitServiceConfiguration() {
		super();
	}

	/**
	 * Instantiates a new limit service configuration.
	 *
	 * @param minimum the minimum
	 * @param maximum the maximum
	 */
	public LimitServiceConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	/**
	 * Gets the minimum.
	 *
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * Sets the minimum.
	 *
	 * @param minimum the new minimum
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	/**
	 * Gets the maximum.
	 *
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * Sets the maximum.
	 *
	 * @param maximum the new maximum
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}	
}
