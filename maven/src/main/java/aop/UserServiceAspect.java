package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceAspect.class);

    // 定义切入点，匹配UserService接口下的所有方法
    @Pointcut("execution(* com.example.demo.service.UserService.*(..))")
    public void userServicePointcut() {}

    // 前置通知，在目标方法执行前执行
    @Before("userServicePointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("前置通知：即将执行 {} 方法", methodName);
    }

    // 后置通知，在目标方法正常执行后执行
    @AfterReturning(pointcut = "userServicePointcut()", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("后置通知：{} 方法执行成功，返回结果：{}", methodName, result);
    }

    // 环绕通知，环绕目标方法执行，可以控制目标方法的执行时机等
    @Around("userServicePointcut()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        logger.info("环绕通知：开始执行 {} 方法", methodName);
        long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        logger.info("环绕通知：{} 方法执行完毕，耗时：{} 毫秒", methodName, endTime - startTime);
        return result;
    }

    // 异常通知，在目标方法抛出异常时执行
    @AfterThrowing(pointcut = "userServicePointcut()", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        logger.error("异常通知：{} 方法抛出异常，异常信息：{}", methodName, ex.getMessage());
    }

    // 最终通知，无论目标方法是否抛出异常都会执行
    @After("userServicePointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("最终通知：{} 方法执行结束", methodName);
    }
}
