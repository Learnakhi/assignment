package com.company;
interface Calculater{
    void add(int num1,int num2);
}
class Calc{
    public static void addSomething(int num1,int num2){
        System.out.println(num1+"and"+num2+"addition is:"+(num1+num2));
    }
}
public class MethodReferences {
    public static void main(String[] args){
        Calculater cRef=Calc :: addSomething;
        cRef.add(11,14);
    }
}
