package com.z.kmodule.shorturl.demo01;

import java.util.function.Function;
import java.util.stream.Collectors;

public class ShortKey {

    private static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";



    public static String toBase62(long num) {
        StringBuilder sb = new StringBuilder();
        int targetBase = BASE.length();
        do {
            int i = (int) (num % targetBase);
            sb.append(BASE.charAt(i));
            num /= targetBase;
        } while (num > 0);
        return sb.reverse().toString();
    }

    public static long toBase10(String input) {
        int srcBase = BASE.length();
        long id = 0;
        String r = new StringBuilder(input).reverse().toString();

        for (int i = 0; i < r.length(); i++) {
            int charIndex = BASE.indexOf(r.charAt(i));
            id += charIndex * (long) Math.pow(srcBase, i);
        }

        return id;
    }

    public static void main(String[] args) {
//        System.out.println(toBase62(999998L));
//        System.out.println(toBase62(999999L));

//        System.out.println(System.getProperty("java.version"));
//        System.getProperties().list(System.out);
//        Collectors.toMap(, Function.identity());
    }

}
