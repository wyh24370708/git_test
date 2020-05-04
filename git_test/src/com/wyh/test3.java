package com.wyh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        maopao();
    }

    private static void maopao() {
//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            array[i] = random.nextInt(100);
//        }
//        System.out.println(Arrays.toString(array));
//        int count = 0;
//        for (int i = 0; i < array.length-1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                count++;
//                if (array[i]>array[j]){
//                    int t = array[j];
//                    array[j] = array[i];
//                    array[i] = t;
//                }
//            }
//        }
//        System.out.println(count);
//        System.out.println(Arrays.toString(array));

        int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34};
        int temp;
        int count =0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                count++;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }
}
