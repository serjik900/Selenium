package com.Syntax.class05;

import java.util.ArrayList;

public class MaintainList {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Abakhan");
        cities.add("Moscow");
        cities.add("Kiev");
        cities.add("Minsk");
        cities.add("Astana");
        cities.add("Achen");
        cities.add("Berlin");
        cities.add("Apline");
        cities.add("Chicago");
        cities.add("New York");
       var iterator=cities.iterator();
        while(iterator.hasNext()){
            var city=iterator.next();
            if(city.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);

    }
}
