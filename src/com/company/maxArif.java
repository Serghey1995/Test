package com.company;

public class maxArif {
    public static void main(String[] args) {
        int d, e, f, g, h;
        int a =2;
        int b= 1;
        int c =2;
        d = a * (b + c);
        e = a * b * c;
        f = a + b * c;
        g = (a + b) * c;
        h = a + b + c;


        int max;
        max = d;
        if (max < e) {
            max = e;
        } else {
            max = d;
        }
        if (max < f) {
            max = f;
        } else {
            max = max;
        }
        if (max < g) {
            max = g;
        } else {
            max = max;
        }
        if (max < h) {
            max = h;
        } else {
            max = max;
        }
        System.out.println(max);
    }

}

