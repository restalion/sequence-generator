package org.restalion.sequence;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.restalion.sequence.exception.GeneratorNotValidException;

@RunWith(JUnit4.class)
public class SequenceGeneratorUtilTest {

	@Test
	public void testRegularNumericSequence() {
		List<String> expected = Arrays.asList("0", "1", "2", "3");
		SequenceGeneratorUtil utilSG = new SequenceGeneratorUtil();
		
		try {
			List<String> actual = utilSG.generateSequence(SequenceType.NUMERIC, "0", Integer.valueOf(4), Integer.valueOf(1));
			
			Assert.assertEquals(expected.size(), actual.size());
			for (int i = 0; i < expected.size(); i++) {
				Assert.assertEquals(expected.get(i), actual.get(i));
			}
		} catch (GeneratorNotValidException gnve) {
			gnve.printStackTrace();
			Assert.fail("No exceptions should be thrown");
		}
	}
	
	@Test
	public void testAlphaSequence3() {
		List<String> expected = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", 
				"1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I", "1J", "1K", "1L", "1M", "1N", "1O", 
				"1P", "1Q", "1R", "1S", "1T", "1U", "1V", "1W", "1X", "1Y", "1Z", "20", "21");
		SequenceGeneratorUtil utilSG = new SequenceGeneratorUtil();
		
		try {
			List<String> actual = utilSG.generateSequence(SequenceType.ALPHANUMERIC, "0", Integer.valueOf(74), Integer.valueOf(2));
			
			Assert.assertEquals(expected.size(), actual.size());
			for (int i = 0; i < expected.size(); i++) {
				Assert.assertEquals(expected.get(i), actual.get(i));
			}
		} catch (GeneratorNotValidException gnve) {
			gnve.printStackTrace();
			Assert.fail("No exceptions should be thrown");
		}
	}
	
	@Test
	public void testException() {
		SequenceGeneratorUtil utilSG = new SequenceGeneratorUtil();
		try {
			utilSG.generateSequence(SequenceType.INVALID, "0", Integer.valueOf(74), Integer.valueOf(2));
			Assert.fail("An exception should be thrown");
		} catch (GeneratorNotValidException gnve) {
			gnve.printStackTrace();
			Assert.assertTrue(gnve instanceof GeneratorNotValidException);
		}
	}
}
