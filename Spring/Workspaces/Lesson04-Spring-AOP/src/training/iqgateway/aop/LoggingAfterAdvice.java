package training.iqgateway.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object result, Method bussinessMethodName, Object[] businessMethodArgs, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging After Advice Invoked...");
		System.out.println("Logging Advice Invoked on"+ bussinessMethodName);
		System.out.println("Arguments of Bussiness Method" + businessMethodArgs[0]);
		System.out.println("Result from the Bussines Method :"+result);

	}

}
