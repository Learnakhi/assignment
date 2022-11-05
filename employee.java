package com.company;
class employe{
    public int getSalary(int Salary){
        return Salary;
    }
}
class labour extends employe{
    int hours;
    int money;
    int time;

        public labour (int hours, int money, int time){
    this.hours=hours;
    this.money=money;
    this.time=time;
        }
        public int getSalary(){
    return(hours * money * time);
        }
        }
        class manager extends employe{
    public int getSalary(int Salary)
    {
       return Salary;
    }
        }
public class employee {
    public static void main(String[] args){
        employe s=new employe();
        int p=s.getSalary(500);
        System.out.println(p);
        labour l=new labour(5,100,30);
        int v=l.getSalary();
        System.out.println(v);
        manager g=new manager();
        int r=g.getSalary(900);
        System.out.println(r);
        int totalSalary=p+v+r;
        System.out.println(totalSalary);

    }
}
