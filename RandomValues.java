package com.company;

import java.util.*;
public class RandomValues {
    public static void main(String args[]) {
        HashMap<Integer, Double> h = new HashMap<Integer, Double>();
        h.put(1, 1.0);
        h.put(2, 2.0);
        h.put(3, 3.0);
        h.put(4, 4.0);
        h.put(5, 5.0);
        h.put(6, 6.0);
        h.put(7, 7.0);
        h.put(8, 8.0);
        h.put(9, 9.0);
        h.put(10, 10.0);
        Set s = h.entrySet();
        System.out.println(s);
    }
}
