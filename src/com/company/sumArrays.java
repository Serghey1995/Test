package com.company;

public class sumArrays {
    public static void main(String[] args) {
    int sum = 0;
    int sum2 = 0;
    int [] arr1 ={1,2,3};
    int [] arr2 ={4,5,6};
        for (int i = 0; i < arr1.length; i++){

            sum = sum + arr1[i];
    }
        for (int i = 0; i < arr2.length; i++){

            sum2 = sum2 + arr2[i];
        }
        System.out.println(sum+sum2);
}
}
