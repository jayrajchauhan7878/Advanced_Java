package may11;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {

    public static void main(String[] args) {

        Map<Integer,String> pl = new HashMap<>();

        pl.put(1,"Java");
        pl.put(2,"JavaScript");
        pl.put(3,"C++");
        pl.put(4,"Go");


        System.out.println("HashMap: "+pl);


        System.out.println("Keys: "+pl.keySet());

        System.out.println("Values :"+pl.values());

        System.out.println("Key/Values mappings: " +pl.keySet());

        pl.remove(3,"C++");

        System.out.println(pl);

        pl.replace(4,"Kotlin");

        System.out.println("After replacing values :"+pl);
    }
}
