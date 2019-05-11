package org.restalion.sequence.generators;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class AlphanumericSequenceGeneratorTest2 {

	@Test
	public void testRegularSequence() {
		List<String> expected = Arrays.asList("0", "1", "2", "3");
		AlphanumericSequenceGenerator alphanumericSG = new AlphanumericSequenceGenerator();
		
		List<String> actual = alphanumericSG.generate("0", 4, 1);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testAlphaSequence() {
		List<String> expected = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z");
		AlphanumericSequenceGenerator alphanumericSG = new AlphanumericSequenceGenerator();
		
		List<String> actual = alphanumericSG.generate("0", 36, 2);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testAlphaSequence2() {
		List<String> expected = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z", "10", "11", "12", "13");
		AlphanumericSequenceGenerator alphanumericSG = new AlphanumericSequenceGenerator();
		
		List<String> actual = alphanumericSG.generate("0", 40, 2);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testAlphaSequence3() {
		List<String> expected = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", 
				"1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I", "1J", "1K", "1L", "1M", "1N", "1O", 
				"1P", "1Q", "1R", "1S", "1T", "1U", "1V", "1W", "1X", "1Y", "1Z", "20", "21");
		AlphanumericSequenceGenerator alphanumericSG = new AlphanumericSequenceGenerator();
		
		List<String> actual = alphanumericSG.generate("0", 74, 2);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testAlphaSequence3Limited() {
		List<String> expected = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z");
		AlphanumericSequenceGenerator alphanumericSG = new AlphanumericSequenceGenerator();
		
		List<String> actual = alphanumericSG.generate("0", 74, 1);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testAlphaSequence4Limited() {
		List<String> expected = Arrays.asList("19", "1A", "1B", "1C");
		AlphanumericSequenceGenerator alphanumericSG = new AlphanumericSequenceGenerator();
		
		List<String> actual = alphanumericSG.generate("19", 4, 2);
		
		Assert.assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
}
