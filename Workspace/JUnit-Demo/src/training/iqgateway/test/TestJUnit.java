package training.iqgateway.test;

import org.junit.Test;

import junit.framework.Assert;

public class TestJUnit {

	@SuppressWarnings("deprecation")
	@Test
	public void tetsetup() {
		String str ="I am done with JUnit Setup";
		Assert.assertEquals("I am done with JUnit Setup",str);;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//
//	}

}
