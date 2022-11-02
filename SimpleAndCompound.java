package com.company;
import java.util.*;
public class SimpleAndCompound {
    public static void main(String[] args){
        double p,t,r,si,ci;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount:");
        p=sc.nextDouble();
        System.out.println("Enter number of years:");
        t=sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        r=sc.nextDouble();
        si=(p*t*r)/100;
        ci=p*Math.pow(1.0+r/100.0,t)-p;
        System.out.println("Simple interest="+si);
        System.out.println("Compound interest="+ci);

    }
}
