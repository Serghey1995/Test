package com.company;

public class arraySum {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr ={1,-2,3,4,5};
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
