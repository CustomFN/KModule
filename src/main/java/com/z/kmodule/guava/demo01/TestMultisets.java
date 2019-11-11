package com.z.kmodule.guava.demo01;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multisets;

import java.util.Arrays;
import java.util.List;

public class TestMultisets {

    public static void main(String[] args) {
        Object[] result = null;
        String[] stringArray = {"a", "b", "c", "a", "d", "d", "e", "f", "f", "f"};

        List<String> listOfStr = Arrays.asList(stringArray);
        result =  Multisets.copyHighestCountFirst(ImmutableMultiset.copyOf(stringArray)).elementSet().toArray();
        System.out.println(Arrays.toString(result));
    }
}
