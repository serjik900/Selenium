package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[]args){
        LinkedList<Integer> num=new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        int sum = 0;
        for (int i=0;i< num.size();i++) {


sum+=num.get(i);


        }
        System.out.println(sum);

    }
}

