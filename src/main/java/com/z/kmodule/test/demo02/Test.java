package com.z.kmodule.test.demo02;

import com.alibaba.fastjson.JSONArray;
import com.z.kmodule.stream.demo01.User;
import org.apache.tomcat.util.codec.binary.Base64;

public class Test {

    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
//        Integer a = 100;
//        Integer b = 1001;
//        Integer c = new Integer(100);
//        System.out.println(c == a);

//        JSONArray jsonArray = JSONArray.parseArray("");
//        System.out.println(jsonArray);

//        byte a = 1;
//        Byte b = 1;
//        Long c = 1L;
//        System.out.println(a == b && c > 0);

//        Base64 base64 = new Base64();
//        byte[] decode = base64.decode("");
//        System.out.println(new String(decode));


        User user = new User();
        user.setAge(10);
        user.setAddress("1");
        user.setName("1");

    }

    public static int[] output(int[] arr, int count) {
        Node node = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            build(node, arr[i]);
        }
        return null;
    }

    public static void build(Node node, int value) {
        if (value == node.value) {
            Node tmp = node.right;
            if (tmp == null) {
                node.right = new Node(value);
            } else {
                Node newNode = new Node(value);
                node.right = newNode;
                newNode.right = tmp;
            }
        } else if (value < node.value) {
            Node tmp = node;
            Node newNode = new Node(value);
            newNode.right = tmp;
            node = newNode;
        } else {

        }
    }
}


class Node {

    Integer value;

    Node left;

    Node right;

    public Node() {
    }

    public Node(Integer value) {
        this.value = value;
    }
}