package com.z;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.z.kmodule.aspectJ.User;

import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        in.nextLine();
//        int[] arr = new int[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(JSON.toJSONString(arr));



        int[] arr = {5, 2, 4,3,1, 6 ,8, 9, 7, 5, 2};
        quickSort2(arr, 0, arr.length - 1);
//        bubbleSort(arr);
//        bubbleSort1(arr);
//        insertSort(arr);
//        selectSort(arr);
        System.out.println(JSON.toJSONString(arr));
//        User user = new User();
//
//        System.out.println(1 == user.getAge());
    }

    public static void quickSort2(int[] arr, int left, int right) {
        if(arr == null || arr.length == 0 || left > right) {
            return;
        }

        int tmpLeft = left;
        int tmpRight = right;
        int key = arr[left];

        while(tmpLeft < tmpRight) {
            while(arr[tmpRight] >= key && tmpLeft < tmpRight) tmpRight--;
            while(arr[tmpLeft] <= key && tmpLeft < tmpRight) tmpLeft++;

            if(tmpLeft < tmpRight) {
                int tmp = arr[tmpLeft];
                arr[tmpLeft] = arr[tmpRight];
                arr[tmpRight] = tmp;
            }
        }

        arr[left] = arr[tmpLeft];
        arr[tmpLeft] = key;
        quickSort2(arr, left, tmpLeft - 1);
        quickSort2(arr, tmpLeft + 1, right);

    }

    public static void quickSort3(int[] arr, int left, int right) {
        if(arr.length == 0 || left > right) {
            return;
        }

        int tmpLeft = left;
        int tmpRight = right;
        int key = arr[left];
        while (tmpLeft < tmpRight) {
            while (tmpLeft < tmpRight && arr[tmpRight] >= key) {
                tmpRight--;
            }
            while (tmpLeft < tmpRight && arr[tmpLeft] <= key) {
                tmpLeft++;
            }
            if (tmpLeft < tmpRight) {
                int temp = arr[tmpLeft];
                arr[tmpLeft] = arr[tmpRight];
                arr[tmpRight] = temp;
            }
        }
        arr[left] = arr[tmpLeft];
        arr[tmpLeft] = key;
        quickSort3(arr, left, tmpLeft - 1);
        quickSort3(arr, tmpLeft + 1, right);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(arr == null || arr.length == 0 || left > right) {
            return;
        }

        int tmpRight = right;
        int tmpLeft = left;
        int key = arr[left];
        while (tmpLeft < tmpRight) {
            while (arr[tmpRight] >= key && tmpLeft < tmpRight) {
                tmpRight--;
            }
            while (arr[tmpLeft] <= key && tmpLeft < tmpRight) {
                tmpLeft++;
            }
            if (tmpLeft < tmpRight) {
                int tmp = arr[tmpLeft];
                arr[tmpLeft] = arr[tmpRight];
                arr[tmpRight] = tmp;
            }
        }

        arr[left] = arr[tmpLeft];
        arr[tmpLeft] = key;
        quickSort(arr, left, tmpRight - 1);
        quickSort(arr, tmpRight + 1, right);
    }

    public static void quickSort1(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }

        int tmpLeft = left;
        int tmpRight = right;
        int key = arr[left];
        while (tmpLeft < tmpRight) {
            while (arr[tmpRight] >= key && tmpLeft < tmpRight) {
                tmpRight--;
            }
            while (arr[tmpLeft] <= key && tmpLeft < tmpRight) {
                tmpLeft++;
            }
            if(tmpLeft < tmpRight) {
                int tmp = arr[tmpLeft];
                arr[tmpLeft] = arr[tmpRight];
                arr[tmpRight] = tmp;
            }
        }

        arr[left] = arr[tmpLeft];
        arr[tmpLeft] = key;
        quickSort1(arr, left, tmpRight - 1);
        quickSort1(arr, tmpRight + 1, right);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int k = i;
            while(k > 0 && key < arr[k - 1]) {
                arr[k] = arr[k - 1];
                k--;
            }
            arr[k] = key;
        }
    }

    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int maxNum = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(maxNum < arr[j]) {
                    maxNum = arr[j];
                    index = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
