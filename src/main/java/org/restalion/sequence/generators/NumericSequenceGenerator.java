package org.restalion.sequence.generators;

import java.util.ArrayList;
import java.util.List;

public class NumericSequenceGenerator implements SequenceGenerator {

	/**
	 * Numeric generate method.
	 *
	 * @param initialValue initial value of the sequence
	 * @param numValues number of values to be generated
	 * @param maxLength max length of the sequence values to be generated
	 * @return list of generated values
	 */
	public List<String> generate(String initialValue, Integer numValues, Integer maxLength) {
		List<String> values = new ArrayList<>();
		
		Integer iInitialValue = Integer.valueOf(initialValue);
		
		for (int i = iInitialValue; i < iInitialValue + numValues; i++) {
			if (Integer.toString(i).length() <= maxLength)
				values.add(Integer.toString(i));
		}
		
		return values;
	}

}
