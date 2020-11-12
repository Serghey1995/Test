package com.company;

public class days {
    public static void main(String[] args) {
    boolean result;
    boolean employed = true;
    boolean vacation = false;
            if (employed == true && vacation == false){
        result= true;}
            else if (employed == true && vacation == true){
        result =false;}
            else if (employed == false && vacation == false){
        result = false;}
            else {
        result =false;}
        System.out.println(result);

}
}
