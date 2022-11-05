package com.company;
abstract class School
{
    abstract void student();
}
class Content extends School
{
    void student()
    {
        System.out.println("student gives exams");
    }
}
abstract class cars
{
    abstract void swift();
}
abstract class check
{
    void verification()
    {
        System.out.println("verification completed");
    }
}

public class AbstractClassRule {
    public static void main(String[] args){

    }
}
