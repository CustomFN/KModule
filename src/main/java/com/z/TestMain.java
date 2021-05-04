package com.z;

import lombok.Data;

import java.util.*;

public class TestMain {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode();
//
//        TreeNode left = new TreeNode();
//        left.setVal(1);
//
//        TreeNode right = new TreeNode();
//        right.setVal(3);
//        root.setVal(2);
//        root.setLeft(left);
//        root.setRight(right);
//        print(root);
        System.out.println(resolve01("pwwkew"));
        System.out.println(findLongest("pwwkew"));
    }

    public static int resolve01(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(int end = 0, start = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                start = Math.max(map.get(c), start);
            }

            ans = Math.max(end - start + 1, ans);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    public static int findLongest(String str) {
        if(str == null) return 0;

        int ans = 0;
        int length = str.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; end++) {
            char c = str.charAt(end);
            if(map.get(c) != null) {
                start = Math.max(start, map.get(c));
            }

            ans = Math.max(ans, end - start + 1);
            map.put(c, end + 1);
        }
        return ans;
    }

    // 二叉树、折线遍历。

    public static void print(TreeNode root) {
        if(root == null) return;

        int treeHigh = 1;
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                if (treeHigh % 2 == 0) {
                    stack.push(node);
                } else {
                    System.out.println(node.val);
                }
            }

            if (treeHigh % 2 == 0) {
                while (!stack.isEmpty()) {
                    System.out.println(stack.pop().val);
                }
            }
            treeHigh++;
        }
    }
}

@Data
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
}
