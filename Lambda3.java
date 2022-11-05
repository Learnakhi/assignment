package com.company;

interface Supplier<T>
{
    int m1(int a);
}


public class Lambda3
{
    public static void main(String[] args)
    {
        Supplier lambdaExpression=(int a)->{
            System.out.println(a);
            return a;
        };
        lambdaExpression.m1(5);


    }
}

