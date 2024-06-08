package CollectionFramework;
import  java.util.HashMap;
import java.util.Map;
public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.put("Two", 22); // It will replace the value of "Two" from 2 to 22
        //to remove this behaviour we can use putIfAbsent method
        numbers.putIfAbsent("Two", 2);
        //way 2
        if (!numbers.containsKey("Two")) {
            numbers.put("Two", 2);
        }


        System.out.println(numbers);

        System.out.println(numbers.get("Three"));

        System.out.println(numbers.containsKey("Five"));

        System.out.println(numbers.containsValue(5));

        System.out.println(numbers.size());

        System.out.println(numbers.remove("Four"));
        System.out.println(numbers);

        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (String key : numbers.keySet()) {
            System.out.println(key + " : " + numbers.get(key));
        }

        for (Integer value : numbers.values()) {
            System.out.println(value);
        }


        numbers.clear();
        System.out.println(numbers);
    }
}
