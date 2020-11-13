package com.company;

public class sumArrays2 {
    public static void main(String[] args) {
        int sum= 0;
        int [] arr1 ={1,2,3};
        int [] arr2 ={4,5,6};
        for (int i=0,j = 0; i < arr1.length && j <arr2.length ; i++,j++){

            sum =sum + arr1[i]+arr2[j];
        }
        System.out.println(sum);
    }
}
