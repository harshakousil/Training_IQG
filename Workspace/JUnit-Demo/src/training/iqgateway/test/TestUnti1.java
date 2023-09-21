package training.iqgateway.test;

import org.junit.Assert;
import org.junit.Test;

public class TestUnti1 {
	
	String message ="Robert";
	
	MessageUtil messageUtilRef = new MessageUtil(message);
	
	@Test
	public void testPrintMessage()
	{
		System.out.println("Inside testPrintMesage()...");
		Assert.assertEquals(message,messageUtilRef.printMessage());
	}

}
