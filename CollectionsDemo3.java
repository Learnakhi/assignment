package com.company;
import java.util.*;
public class CollectionsDemo3 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Akhila");
        al.add("Bunny");
        al.add("Sai Kiran");
        al.add("Ammulu");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
