package com.company;
class Single
{
    static Single s=new Single();
    private Single(){
        System.out.println("this is singleton class");
    }
    static Single getInstance(){
        return s;
    }
}
public class SingletonDemo {
    public static void main(String[] args)
    {
        Single str1=Single.getInstance();
        Single str2=Single.getInstance();
        System.out.println(str1);
        System.out.println(str2);
    }
}
