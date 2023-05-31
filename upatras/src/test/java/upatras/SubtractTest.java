package upatras;

import org.junit.Assert;
import org.junit.Test;


public class SubtractTest {

	@Test
	public void test() {
		int a = 4;
        int b = 7;
        Final finObj = new Final();
        String result = finObj.subtractIntegers(a, b);
        
        Assert.assertEquals("NEGATIVE", result);
	}

}
