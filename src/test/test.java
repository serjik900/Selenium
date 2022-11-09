package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ar.add(input.nextInt());

        }
        Iterator<Integer> iterate=ar.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println("**************************************");

        LinkedList<Integer> list=new LinkedList<>();
        for (int i=50;i<100;i++){
            list.add(input.nextInt());
        }
        Iterator <Integer> iteration=list.iterator();
        while(iteration.hasNext()){
            System.out.println(iterate.next());
        }
    }
}

