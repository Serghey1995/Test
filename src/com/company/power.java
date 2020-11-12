package com.company;


    class power {
        public static void main(String[] args) {
            int[] n ={1,2,2} ;
            int b = 2;
            int sum=0;

            for (int i = 0; i < n.length; i++) {
                sum = sum + (int)Math.pow(n[i],b);
            }
            System.out.println(sum);
        }
    }


