package com.z.learn.ioc.BeanInfo;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;

public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException {

//        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);

        Stream.of(beanInfo.getPropertyDescriptors())
                .forEach(propertyDescriptor -> {
                    System.out.println(propertyDescriptor);

                    Class<?> propertyType = propertyDescriptor.getPropertyType();
                    String propertyTypeName = propertyType.getName();
                    if ("age".equals(propertyTypeName)) {
                        propertyDescriptor.setPropertyEditorClass(Integer2StringPropertyEditor.class);
                    }
                });
    }

    static class Integer2StringPropertyEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            Integer value = Integer.valueOf(text);
            setValue(value);
        }
    }
}
