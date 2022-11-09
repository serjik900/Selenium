package com.Syntax.Recap;

import java.util.ArrayList;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("lizzard");
        animals.add("Horse");
        animals.add("Sheep");

        //System.out.println(animals);

        System.out.println(animals);

      /*  for(String animal:animals){
            System.out.println(animal.length());//print String length
        }

        //remove word which contains more than 5 letters

        animals.removeIf(x->x.length()>4);
        System.out.println(animals);*/

        //if element more than 4 letters we want to replace it with Donkey
//we should not use iterator because we are not performing any operation that can change the size of the List
        //we shouldf not use the for loop here as we are not printinfg the data we are updating the data as we need the index to update the data we should use simple for loop


        for(int i=0;i<animals.size();i++){
 if(animals.get(i).length()>4){
     animals.set(i,"Donkey");//set method replace elements
 }
          

        }

        System.out.println(animals);

    }




}
