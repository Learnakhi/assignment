package com.company;

import java.lang.*;
import java.util.*;
class Date
{  Integer date;
    Integer Month;
    Integer year;
    public Date(Integer d,Integer Month,Integer year)
    {
        this.date=d;
        this.Month=Month;
        this.year=year;
    }

    @Override
    public String toString() {
        return date+"-"+Month+"-"+year;
    }
}
class LinkedList4 {
    public static void main(String args[])
    {
        LinkedList<Date> list=new LinkedList<>();
        Date d1=new Date(4,7,2000);
        Date d2=new Date(11,11,2011);
        Date d3=new Date(18,12,2016);
        Date d4=new Date(07,7,2017);
        Date d5=new Date(26,4,2021);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        System.out.println(list);
        Iterator<Date> itr=list.iterator();
        while(itr.hasNext())
        {
            Date d=(Date)itr.next();
            Integer date=d.date;
            Integer month=d.Month;
            Integer year=d.year;
            if(year%400==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is leap year");
            }
            else if(year%100==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is not leap year");
            }
            else if(year%4==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is leap year");
            }
            else {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is not leap year");
            }
        }

    }
}

