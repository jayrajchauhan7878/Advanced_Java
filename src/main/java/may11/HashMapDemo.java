package may11;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String , Integer> numbers = new HashMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);

        System.out.println("Map :"+numbers);

        System.out.println("Size "+numbers.size());

        System.out.println("Print Key "+numbers.keySet());

        System.out.println("Print values : "+numbers.values());

        System.out.println("Remove value"+numbers.remove("Two"));

        System.out.println("Updated Value"+numbers.get("One"));

        System.out.println(numbers);
    }
}
