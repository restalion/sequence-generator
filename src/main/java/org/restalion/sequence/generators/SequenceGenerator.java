package org.restalion.sequence.generators;

import java.util.List;

public interface SequenceGenerator {

	/**
	 * Generate method.
	 *
	 * @param initialValue initial value of the sequence
	 * @param numValues number of values to be generated
	 * @param maxLength max length of the sequence values to be generated
	 * @return list of generated values
	 */
	public List<String> generate(String initialValue, Integer numValues, Integer maxLength);
}
