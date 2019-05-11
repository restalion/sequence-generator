package org.restalion.sequence.generators;

import java.util.ArrayList;
import java.util.List;

public class AlphanumericSequenceGenerator implements SequenceGenerator {

	private final static String VALUES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * Alphanumeric generate method.
	 *
	 * @param initialValue initial value of the sequence
	 * @param numValues number of values to be generated
	 * @param maxLength max length of the sequence values to be generated
	 * @return list of generated values
	 */
	public List<String> generate(String initialValue, Integer numValues, Integer maxLength) {
		List<String> values = new ArrayList<>();
		Integer initialNumber = calculateInitialNumber(initialValue);
		System.out.println("Initial code: " + generateCode(initialNumber));
		
		for (int i = initialNumber; i < numValues + initialNumber; i++) {
			String generated = generateCode(i);
			System.out.println("Generated: " + generated);
			if (generated.length() <= maxLength) 
				values.add(generateCode(i));
		}
		
		return values;
	}
	
	/**
	 * Recursive method to generate the number
	 * @param number Number to generate
	 * @return Generated String
	 */
	public String generateCode(Integer number) {
		if (number < VALUES.length()) {
			return Character.toString(VALUES.charAt(number));
		} else {
			Integer n = number/VALUES.length();
			Integer mod = number%VALUES.length();
			return generateCode(n) + generateCode(mod);
		}
	}
	
	private Integer calculateInitialNumber(String initialValue) {
		
		Integer number = 0;
		String reverse = new StringBuilder(initialValue).reverse().toString();
		System.out.println(reverse);
		
		for (int i = 0; i < reverse.length(); i++) {
			System.out.println(VALUES.length() ^ (i));
			number += VALUES.indexOf(reverse.charAt(i)) * (int) Math.pow(VALUES.length(), i);

		}
		
		System.out.println("number " + number);
		
		return number;
	}
}
