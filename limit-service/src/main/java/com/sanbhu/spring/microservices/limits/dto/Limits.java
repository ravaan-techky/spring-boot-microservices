package com.sanbhu.spring.microservices.limits.dto;

/**
 * The Class Limits.
 */
public class Limits {

	/** The minimum. */
	private int minimum;
	
	/** The maximum. */
	private int maximum;
	
	/**
	 * Instantiates a new limits.
	 */
	public Limits() {
		super();
	}

	/**
	 * Instantiates a new limits.
	 *
	 * @param minimum the minimum
	 * @param maximum the maximum
	 */
	public Limits(int minimum, int maximum) {
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
