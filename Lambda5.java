package com.company;
import java.util.Arrays;
import java.util.function.Consumer;



public class Lambda5
{
    public static void main(String[] args)
    {
        Consumer<String> c=new Consumer<String>() {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        };
       /* c.accept("Java");
        c.accept("Oops");
        c.accept("Data");
        c.accept("Scope");
        System.out.println(c);*/
        StringBuilder str=new StringBuilder();
        {

            Arrays.asList("Java","Oops","Data","Scope").forEach(word->str.append(word.charAt(0)));
            System.out.println(str);
        }

    }
}
