package spring.aop.advice;

import java.lang.reflect.*;

import org.springframework.aop.*;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("앞에서 실행 될 로직");
	}

}
