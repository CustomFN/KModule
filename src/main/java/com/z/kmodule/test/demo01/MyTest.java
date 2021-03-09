package com.z.kmodule.test.demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class MyTest {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/mtdp/Other/projects/KModule/target/classes/com/z/kmodule/test/demo01/TestClassLoader.class");
//        File file = new File(".");
//        System.out.println();
        file = file.getAbsoluteFile();
        FileInputStream inputStream = new FileInputStream(file);
        byte[] result = new byte[1024];

        int count = inputStream.read(result);
        MyClassLoader loader = new MyClassLoader();
        Class<?> aClass = loader.defineMyClass(result, 0, count);

        System.out.println(aClass.getCanonicalName());

        Object obj = aClass.newInstance();
        aClass.getMethod("code", null).invoke(obj, null);
    }
}
