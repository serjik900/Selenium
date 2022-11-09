package com.Syntax.class05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDup {
    public static void main(String[] args) {
        LinkedHashSet<String> aList=new LinkedHashSet<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(aList);
    }
}
