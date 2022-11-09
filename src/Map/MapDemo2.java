package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> beautyyProduct=new LinkedHashMap<>();
        beautyyProduct.put("Foundation",55.4);
        beautyyProduct.put("Blush",10.3);
        beautyyProduct.put("LipStick",3.4);

        LinkedHashMap<String, Double> cosmetic=new LinkedHashMap<>();
        cosmetic.put("Soap",1.3);
        cosmetic.put("Shampoo",3.5);

        LinkedHashMap<String,Double> all=new LinkedHashMap<>();
        all.putAll(beautyyProduct);
        System.out.println(all);
        all.putAll(cosmetic);
        System.out.println(all);

        System.out.println(all);

        Set<String> keySet=all.keySet();//return all the keys in the form of set
        System.out.println(keySet);


        var value=all.values();//return all the values in the form of a collection
        System.out.println(value);


        var allKeys=all.keySet();
        System.out.println(allKeys);

        Iterator<String> iterator= allKeys.iterator();
        while(iterator.hasNext()){
            String item= iterator.next();
            if(item.contains("l")){
                iterator.remove();
            }
        }
        System.out.println(all);
    }
}
