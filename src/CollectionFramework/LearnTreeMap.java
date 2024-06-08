package CollectionFramework;
import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();

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

        numbers.remove("Four");
        System.out.println(numbers);

    }
}
