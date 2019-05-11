package org.restalion.sequence.generators;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class NumericSequenceGeneratorTest {

	@Test
	public void testRegularSequence() {
		List<String> expected = Arrays.asList("0", "1", "2", "3");
		NumericSequenceGenerator numericSG = new NumericSequenceGenerator();
		
		List<String> actual = numericSG.generate("0", 4, 1);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testStartingSequence() {
		List<String> expected = Arrays.asList("10", "11", "12", "13");
		NumericSequenceGenerator numericSG = new NumericSequenceGenerator();
		
		List<String> actual = numericSG.generate("10", 4, 2);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testNoValuesSequence() {
		List<String> expected = Arrays.asList();
		NumericSequenceGenerator numericSG = new NumericSequenceGenerator();
		
		List<String> actual = numericSG.generate("10", 4, 1);
		
		Assert.assertEquals(expected.size(), actual.size());
	}
}
