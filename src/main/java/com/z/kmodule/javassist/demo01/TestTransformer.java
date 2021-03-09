package com.z.kmodule.javassist.demo01;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class TestTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("Transforming " + className);

        try {
            ClassPool cp = ClassPool.getDefault();
            CtClass cc = cp.get("com/z/kmodule/test/demo01/TestClassLoader.class");
            CtMethod cm = cc.getDeclaredMethod("code");
            cm.insertBefore("{ System.out.println(\"start\") }");
            cm.insertAfter("{ System.out.println(\"end\") }");
            return cc.toBytecode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


