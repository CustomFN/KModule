package com.z.kmodule.javassist.demo01;

import com.z.kmodule.test.demo01.TestClassLoader;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

public class TestAgent {


    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("premain");
    }

    public static void agentmain(String args, Instrumentation instrumentation) {
        instrumentation.addTransformer(new TestTransformer(), true);
        try {
            instrumentation.retransformClasses(TestClassLoader.class);
            System.out.println("Agent load done");
        } catch (UnmodifiableClassException e) {
            e.printStackTrace();
            System.out.println("Agent load fail");
        }
    }
}
