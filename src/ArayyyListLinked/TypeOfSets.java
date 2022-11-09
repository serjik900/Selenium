package ArayyyListLinked;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TypeOfSets {
    public static void main(String[] args) {

        //HashSet downside  doesn't care about insertion order, Upside it is fastest

        HashSet<String> letters=new HashSet<>();
        letters.add("Mango");
        letters.add("Apple");
        letters.add("Kiwi");
        letters.add("Orange");
        letters.add("Banana");
        System.out.println(letters);

        //insertion speed the asme as HashSet but retrival speed in the worst
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println(linkedHashSet);


        //Treeset sort alphabeticaly
        TreeSet<String> TreeSet=new TreeSet<>();
        TreeSet.add("Mango");
        TreeSet.add("Apple");
        TreeSet.add("Kiwi");
        TreeSet.add("Orange");
        TreeSet.add("Banana");
        System.out.println(linkedHashSet);
    }
}
