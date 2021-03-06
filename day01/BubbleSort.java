package com.jjli.day01;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author Jason
 * @Date 2020/10/20
 **/


public class BubbleSort {
    public static void bubbleSort1(int[] a, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 4, 8, 3, 4, 65};
        BubbleSort.bubbleSort1(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}