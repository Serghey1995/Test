package com.company;



public class sumArrays3 {
    public static void main(String[] args) {
        int[] a1 = {0,1,0,1};
        int[] a2 = {1,0,1};
        int sum=0;
        int sum1=0;
//        int nums[] = new int[arr1.length+arr2.length];
//        int[] arr = {};
//        System.arraycopy(arr1,0,arr,0,arr1.length);
//        System.arraycopy(arr2,0,arr,arr1.length+1,arr2.length);
//        System.arraycopy(arr1,0,nums,0,arr1.length);
//        System.arraycopy(arr2,0,nums,arr1.length,arr2.length);
//        System.out.println("===========");
//        System.out.println("===========");
//
//        for (int i = 0; i <nums.length ; i++) {
//            System.out.println(nums[i]);
//        }
        for (int i = 0; i < Math.max(a1.length, a2.length); i++) {
//            sum  += (i >= a1.length ? 0 : a1[i]) + (i >= a2.length ? 0 : a2[i]);
            if(i >= a1.length){
                sum +=0;
            } else {
                sum +=a1[i];
            }
            if (i >= a2.length){
                sum +=0;
            } else{
                sum+=a2[i];
            }
        }
        System.out.println(sum+sum1);
// 0

    }
}
//         System.arraycopy(array,0,array1,9,10);  копирование 10 элементов из массива array, начиная с позиции 0, в массив array1, начиная с позиции 9
   //      System.arraycopy(array,10,array2,19,10);  копирование 10 элементов из массива array с позиции 0 в массив array2 с позиции 19

//        from - массив, который копируем
//        to - массив в которой копируем
//        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
//        toIndex - индекс в массиве to начиная с которого вставляем элементы
//        count - количество элементов которые берем из массива from и вставляем в массив to
//        Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.