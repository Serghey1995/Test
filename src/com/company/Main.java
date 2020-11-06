package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dublicareArr = new ArrayList<Integer>();
        dublicareArr.add(1);
        dublicareArr.add(1);
        dublicareArr.add(2);
        dublicareArr.add(2);
        dublicareArr.add(3);
        dublicareArr.add(3);
        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        for (Integer n : dublicareArr) {
            if (!sortedArr.contains(n)) {
                if (n % 2 == 0) {
                    sortedArr.add(n);
                }
            }
        }
        System.out.println(dublicareArr);
        System.out.println(sortedArr);
        System.out.println("Изменение");
    }
}
