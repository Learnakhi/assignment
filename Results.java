package com.company;
import java.util.*;
public class Results {
    public static void main(String[] args){
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject1 marks");
        m1=sc.nextInt();
        System.out.println("enter subject2 marks");
        m2=sc.nextInt();
        System.out.println("enter subject3 marks");
        m3=sc.nextInt();
    if(m1>60 && m2>60 && m3>60){
        System.out.println("passed");
    }
    else if(m1<60 && m2<60 && m3<60){
        System.out.println("failed");
    }
     else{
         System.out.println("promoted");
    }
    }
}
