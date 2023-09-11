package com.example.demo4;

import java.math.BigInteger;
import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {
        // тут можете тестировать ваш код

        convert(10);
        System.out.println(normalize(721));
        System.out.println(max(10, 12, -14));
        System.out.println(fact(12));
        System.out.println(fact(BigInteger.valueOf(30)));
        multiplTable();
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
        System.out.println(isMagicSquare(new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}}));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(sort(new int[]{2, 1, 45, 34, 12, 2})));
        System.out.println(Arrays.toString(removeExtra(new int[]{2, 1, 45, 2, 34, 1, 12, 2}, 2)));
    }

    // task 1
    static void convert(int arg) {
        String two = Integer.toString(arg, 2);
        System.out.println("Число в двоичной системе: " + two);
        String eight = Integer.toString(arg, 8);
        System.out.println("Число в восьмеричной системе: " + eight);
        String sixteen = Integer.toString(arg, 16);
        System.out.println("Число в шестнадцатиичной системе: " + sixteen);
    }


    // task 2
    static int normalize(int angle) {
        angle = angle % 360;
        if (angle < 0) {
            angle = 360 + angle;
        }
        return angle;
    }


    // task 3
    static int max(int x, int y, int z) {
        int FirstMax = Math.max(x, y);
        int SecondMax = Math.max(FirstMax, z);
        return SecondMax;
    }


    // task 4
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; ++i) {
            res = res * i;
        }
        return res;
    }


    // task 5
    static BigInteger fact(BigInteger n) {
        if (n == BigInteger.ZERO || n == BigInteger.ONE) {
            return BigInteger.ONE;
        }
        return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }

    // task 6
    static void multiplTable() {
        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= 9; ++j) {
                if (i * j < 10){
                    System.out.print(" " + i * j + " ");
                }
                else{
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }


    // task 7
    static int average(int... nums) {
        int l = nums.length;
        int sum = 0;
        for (int i = 0; i < l; i++){
            sum += nums[i];
        }
        return sum / l;
    }


    // task 8
    static boolean isMagicSquare(int[][] square) {
        int l = square[0].length;
        int line = 0, sum = 0, f = 0;
        for (int i = 0; i < l; ++i){
            line += square[0][i];
        }
        for (int i = 0; i < l; ++i){
            for (int j = 0; j < l; ++j){
                sum += square[i][j];
            }
            if (sum == line){
                sum = 0;
            }
            else {
                f = 1;
                break;
            }
        }

        for (int i = 0; i < l; ++i){
            for (int j = 0; j < l; ++j){
                sum += square[j][i];
            }
            if (sum == line){
                sum = 0;
            }
            else {
                f = 1;
                break;
            }
        }

        for (int i = 0; i < l; ++i) {
            sum += square[i][i];
        }
        if (sum == line){
            sum = 0;
        }
        else {
            f = 1;
        }

        for (int i = l - 1; i >= 0; --i) {
            sum += square[i][i];
        }
        if (sum == line){
            sum = 0;
        }
        else {
            f = 1;
        }

        if (f == 0){
            return true;
        }
        else {
            return false;
        }
    }


    // task 9
    static int[] reverse(int[] arr) {
        int l = arr.length;
        int[] ReverseArr = new int[l];
        for (int i = 0; i < l; ++i) {
            ReverseArr[i] = arr[l - i - 1];
        }
        return ReverseArr;
    }


    // task 10
    static int[] sort(int[] arr) {
        int l = arr.length, t = 0;
        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < l - i - 1; ++j) {
                if (arr[j + 1] < arr[j]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }


    // task 11
    static int[] removeExtra(int[] arr, int n) {
        int l = arr.length;
        for (int i = 0; i < l; ++i) {
            if (arr[i] == n) {
                int[] a = new int[l-1];
                System.arraycopy(arr, 0, a, 0, i);
                System.arraycopy(arr, i + 1, a, i, l - i - 1);
                arr = a;
                --l;
                --i;
            }
        }
        return arr;
    }
}
