package com.company;

public class Armstrong {
    public static void main(String[] args){
        int i=100,sum,rem,n,temp;
    System.out.println("Armstrong number between 100-999");
    while (i<999){
        n=i;
        sum=0;
        while (n>0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum==i)
            System.out.println(i);
        i++;
        }
    }
}
