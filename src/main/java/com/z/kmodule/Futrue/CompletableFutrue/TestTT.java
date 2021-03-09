package com.z.kmodule.Futrue.CompletableFutrue;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;

public class TestTT {

    public static void main(String[] args) {
//        CompletableFuture<String> cf = new CompletableFuture<>();
//
//
//
//        cf.complete("complete");

//        String text = "81119";
//        text = text.length() < 4 ? text : text.substring(text.length() - 4, text.length());
//        System.out.println(text);

        HashSet<Integer> set1 = Sets.newHashSet(118101);
        HashSet<Integer> set2 = Sets.newHashSet(118101);
        Sets.SetView<Integer> union = Sets.union(set1, set2);
        Sets.SetView<Integer> diff = Sets.difference(set1, union);
        System.out.println(diff);
    }
}
