package core.asserts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Asserts implements IAsserts {

	@Override
	public void isTextFound(String text1, String text2) {
	
		assertEquals(text1, text2 , "Text provided ****'" + text1 + "'*** is not found");
	}
	@Override
	public void isFound(boolean value) {
		assertTrue(value, "Expected ***True*** but received ***false***");
	}
}
