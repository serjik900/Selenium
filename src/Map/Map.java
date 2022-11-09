package Map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,String> data=new HashMap<>();
        data.put("Password","pass123");
        data.put("UserName","anJljfgs;lds");
        System.out.println(data);
        System.out.println(data.get("Password"));// get back the value
    }
}
