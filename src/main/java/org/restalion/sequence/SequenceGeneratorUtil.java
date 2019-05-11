package org.restalion.sequence;

import java.util.List;

import org.restalion.sequence.exception.GeneratorNotValidException;
import org.restalion.sequence.generators.AlphanumericSequenceGenerator;
import org.restalion.sequence.generators.NumericSequenceGenerator;
import org.restalion.sequence.generators.SequenceGenerator;

public class SequenceGeneratorUtil {

	/**
	 * Generate sequence method.
	 *
	 * @param type type of sequence, should be included in SequenceType class
	 * @param initialValue initial value of the sequence
	 * @param numValues number of values to be generated
	 * @param maxLength max length of the sequence values to be generated
	 * @return list of generated values
	 * @throws GeneratorNotValidException
	 */
	public List<String> generateSequence(SequenceType type, String initialValue, Integer numValues, Integer maxLength)
		throws GeneratorNotValidException {

		SequenceGenerator generator;

		switch (type) {
			case NUMERIC: generator = new NumericSequenceGenerator();
						  break;
			case ALPHANUMERIC: generator = new AlphanumericSequenceGenerator();
			                   break;
			default: throw new GeneratorNotValidException();
		}

		return generator.generate(initialValue, numValues, maxLength);
	}
}
