package com.company;

public class ExceptionDemo1 {
    public static void main(String[] args){
        try{
            int a=0;
            int b=7/a;
            System.out.println("After Exception");

        }
        catch(ArithmeticException ex){
            System.out.println("Division by Zero");
            ex.printStackTrace();
        }
    }

}
