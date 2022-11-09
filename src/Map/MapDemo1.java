package Map;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.22);
        fruit.put("Mango",24.44);
        fruit.put("Bananas",43.44);
        System.out.println(fruit);
        System.out.println(fruit.get("Apple"));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.containsKey("Apple"));
        fruit.replace("Apple", 2.99);
    }
}
