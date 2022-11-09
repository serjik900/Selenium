package ArayyyListLinked;

import java.util.ArrayList;
import java.util.HashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(10);
        System.out.println(num);

        HashSet<Integer> setNum=new HashSet<>();
        setNum.add(10);
        setNum.add(20);
        setNum.add(10);

        System.out.println(setNum);
    }
}
