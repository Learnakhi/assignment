package com.company;

interface SI
{
    int  simpleIntrest(int a,int b,int c) ;
}
public class SimpleIn1
{
    public static void main(String[] args)
    {

        SI simpleIntrestlambda= ( var P, var T, var R) ->
        {
            System.out.println((P*T*R)/100);
            return (P*T*R/100);
        };

        simpleIntrestlambda.simpleIntrest(15000,2,1);


    }
}
