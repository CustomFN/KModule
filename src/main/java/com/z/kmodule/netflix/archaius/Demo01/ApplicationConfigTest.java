package com.z.kmodule.netflix.archaius.Demo01;

public class ApplicationConfigTest {

    private static ApplicationConfig config = new ApplicationConfig();

    public static void main(String[] args) {
        String message = config.getStringProperty("hello.world.message", "default message");
        System.out.println(message);

        String message1 = config.getStringProperty("secondConfig", "default message");
        System.out.println(message1);
    }


}
