package com.z.kmodule.stream.demo02;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Iterator2Stream {

    public static void main(String[] args) {

        Iterator<Integer> iterator = Arrays.asList(3, 2, null, 1).iterator();

        Stream<Integer> stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.SORTED), false);

        System.out.println(Arrays.toString(stream.toArray()));
    }
}
