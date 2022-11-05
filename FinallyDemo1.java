package com.company;

public class FinallyDemo1 {
    public static void main(String[] args){
        int i= getValue();
        System.out.println("value of i"+i);

    }
    static int getValue(){
        try{
            System.out.println("in try block");
            throw new RuntimeException();
        }
        catch(RuntimeException nExp){
            System.out.println("Exception caught in catch block of getValue");
            return 20;
        }
        finally{
            System.out.println("in finally block");
        }
    }
}
