package may11;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

    public static void main(String[] args) {

        Map<Integer,String> pl = new HashMap<>();

        pl.put(1,"Java");
        pl.put(2,"Javascript");
        pl.put(3,"C++");
        pl.put(4,"Go");

        System.out.println("Hashmap :"+pl);

        String value = pl.get(2);

        System.out.println("Value of 2 "+value);



    }
}
