package com.company;

public class reverseWord {
    public static void main(String[] args) {


    String str ="I like eating";
    StringBuilder sb = new StringBuilder();
    String[] arrStr = str.split(" ");

        for (int i = arrStr.length - 1; i >= 0; i--) {
        sb.append(arrStr[i]+" ");

    }
        System.out.println( sb.deleteCharAt(sb.length()-1).toString());
}
}
