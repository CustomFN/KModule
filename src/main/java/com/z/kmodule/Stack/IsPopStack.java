package com.z.kmodule.Stack;

import java.util.Stack;

public class IsPopStack {

    public static void main(String[] args) {
        int[] pushArr = new int[]{1, 2, 3, 4, 5};
        int[] popArr = new int[]{4, 5, 3, 2, 1};
        System.out.println(isPopStack(pushArr, popArr));
    }

    private static boolean isPopStack(int[] pushArr, int[] popArr) {
        if(pushArr == null || popArr == null || pushArr.length != popArr.length) {
            return false;
        }

        int length = pushArr.length;
        Stack<Integer> stack = new Stack<>();
        for(int pushIdx = 0, popIdx = 0; pushIdx < length; pushIdx++) {
            stack.push(pushArr[pushIdx]);
            while(popIdx < length && !stack.isEmpty() && stack.peek() == popArr[popIdx]) {
                stack.pop();
                popIdx++;
            }
        }

        return stack.isEmpty();
    }
}
