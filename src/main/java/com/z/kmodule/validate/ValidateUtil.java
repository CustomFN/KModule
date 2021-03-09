package com.z.kmodule.validate;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.validation.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class ValidateUtil {

    private static Logger logger = LoggerFactory.getLogger(ValidateUtil.class);

    private static Validator validator;

    static {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    public static <T> Map<String, String> validate(T t) {
        System.out.println(JSON.toJSONString(t));
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

        if (constraintViolations.isEmpty()) {
            return null;
        }

        Map<String, String> map = Maps.newHashMap();
        List<ImmutablePair<String, String>> immutablePairList = Lists.transform(Lists.newArrayList(constraintViolations), constraintViolationTransform);
        for (ImmutablePair<String, String> pair : immutablePairList) {
            map.put(pair.getLeft(), pair.getRight());
        }
        return map;
    }

    public static <T> Map<String, String> validateForMap(T t) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

        if (constraintViolations.isEmpty()) {
            return null;
        }
        List<ImmutablePair<String, String>> immutablePairList = Lists.transform(Lists.newArrayList(constraintViolations), constraintViolationTransform);

        Map<String, String> map = Maps.newHashMap();
        for (ImmutablePair<String, String> pair: immutablePairList) {
            map.put(pair.getLeft(), pair.getRight());
        }
        return map;
    }

    public static <T> Object validateWithFieldDetail(T t) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        if (constraintViolations.isEmpty()) {
            return null;
        }
        List<ImmutablePair<String, String>> immutablePairList = Lists.transform(Lists.newArrayList(constraintViolations), constraintViolationTransform);

        return immutablePairList;
    }



//    public static <T> ValidResult validate(T t, Class<?>... groups) {
//        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t, groups);
//
//        if (constraintViolations.isEmpty()) {
//            return ValidResult.EMPTY_RESULT;
//        }
//
//        List<ImmutablePair<String, String>> immutablePairList = Lists.transform(Lists.newArrayList(constraintViolations), constraintViolationTransform);
//        return new ValidResult(Lists.transform(immutablePairList, validateResultPairTransform));
//    }


    private static final Function<ConstraintViolation<?>, ImmutablePair<String, String>> constraintViolationTransform = new Function<ConstraintViolation<?>, ImmutablePair<String, String>>() {
        @Nullable
        @Override
        public ImmutablePair<String, String> apply(@Nullable ConstraintViolation<?> constraintViolation) {
            if (null == constraintViolation) {
                logger.error("[验证异常]_不可能到这_constraintViolation_isnull");
                return ImmutablePair.of("","");
            }

            Iterator<Path.Node> it = constraintViolation.getPropertyPath().iterator();
            String fieldName = null;
            while (it.hasNext()) {
                fieldName = it.next().getName();
            }
            if (fieldName != null) {
                try {
                    String keyValue = constraintViolation.getPropertyPath().toString();
                    String message = constraintViolation.getMessage();
                    return ImmutablePair.of(keyValue, message);
                } catch (SecurityException e) {
                    logger.warn("Cannot find field " + fieldName, e);
                }
            }
            return  ImmutablePair.of(constraintViolation.getPropertyPath().toString(),constraintViolation.getMessage());
        }
    };

    private static final Function<ImmutablePair<String, String>, String> validateResultPairTransform = new Function<ImmutablePair<String, String>, String>() {
        @Nullable
        @Override
        public String apply(@Nullable ImmutablePair<String, String> input) {
            if (null == input){
                logger.error("[不应该到这]_验证异常_input_isnull");
                return "";
            }
            return input.getLeft() + input.getRight();
        }
    };

}
