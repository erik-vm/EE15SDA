package advanced.collectionexample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        //ADd values to Map
        map.put("Bob", 900);   //Bob - key | 900 - value
        map.put("John", 920);
        map.put("Bob", 1000);  //Entering same key, will overwrite the value

        System.out.println(map);

        //Get value from key
        System.out.println("Bob's salary: "+map.get("Bob"));

        //Get all keys
        System.out.println(map.keySet());

        //Size
        System.out.println(map.size());

        //Check is Map containing key
        System.out.println(map.containsKey("Bob"));
        System.out.println(map.containsKey("Erik"));

        //Check is Map containing value
        System.out.println(map.containsValue(1000));

        //Remove key/value pairs from Map if exists
        map.remove("Bob");
        System.out.println(map);

        //Example
        Map<String, String> capitalCity = new HashMap<String, String >();

        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Finland", "Helsinki");
        capitalCity.put("Sweden", "Stockholm");

        System.out.println(capitalCity.get("Finland"));

        for (Map.Entry<String, String> capitalCitiesPrintout : capitalCity.entrySet()){
            System.out.println(capitalCitiesPrintout.getKey());
            System.out.println(capitalCitiesPrintout.getValue());
        }
    }
}
