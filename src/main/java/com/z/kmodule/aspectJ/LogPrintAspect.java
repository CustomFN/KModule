package com.z.kmodule.aspectJ;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Aspect
@Component
public class LogPrintAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogPrintAspect.class);


    @Pointcut("execution(public * com.z.kmodule.aspectJ.*.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("LogPrintAspect#doAround start");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        if (method == null) {
            joinPoint.proceed();
        }

        LogPrint logPrintAnnotation = method.getAnnotation(LogPrint.class);
        if (logPrintAnnotation == null) {
            joinPoint.proceed();
        }

        String classNameOfmethod = method.getDeclaringClass().getName();
        String methodName = method.getName();
        Parameter[] methodParameters = method.getParameters();
        Object[] args = joinPoint.getArgs();

//        LOGGER.info("input: className = {}, methodName = {}, params = {}", classNameOfmethod, methodName, JSON.toJSONString(methodParameters));
        LOGGER.info("input: className = {}, methodName = {}, args = {}", classNameOfmethod, methodName, JSON.toJSONString(args));

        Object result = joinPoint.proceed();

        LOGGER.info("output: className = {}, methodName = {}, result = {}", classNameOfmethod, methodName, JSON.toJSONString(result));

        return result;
    }
}
