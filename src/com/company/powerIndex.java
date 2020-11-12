package com.company;

public class powerIndex {
    public static void main(String[] args) {

    int[] array = new int[]{3,1,2,2} ;
    int n =3;
    int sum = 0;
        if (array.length>n) {
        sum = sum + (int) Math.pow(array[n], n);
        System.out.println(sum);
    } else{
            System.out.println(-1);
        }
}
}
