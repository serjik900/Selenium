package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapReturnValue {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",3.99);
        fruit.put("Orange",41.99);
        fruit.put("Banana",6.99);
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));

        /*Collection<Double> values=fruit.values(); //returns all the values from a map
        Iterator<Double> iterator= values.iterator();
        while(iterator.hasNext()){
            Double value=iterator.next();
            if(value>2){
                iterator.remove();
            }
        }
        System.out.println(fruit); */
        fruit.values().removeIf(x->x>2);
        System.out.println(fruit);



        System.out.println(fruit);

    }
}
