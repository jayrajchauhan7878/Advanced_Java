package may11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterateDemo {

    public static void main(String[] args) {


        Map<Integer,String> pl = new HashMap<>();

        pl.put(1,"Java");
        pl.put(2,"JavaScript");
        pl.put(3,"Go");
        pl.put(4,"Kotlin");

        System.out.println("Keys: ");
        for(Integer key : pl.keySet()){

            System.out.print(key);
            System.out.print(",");
        }

        System.out.println("Values");
        for(String values : pl.values()){

            System.out.print(values);
            System.out.print(",");
        }

        System.out.println("Key/Value Pair");
        for ( Entry <Integer ,String> kv : pl.entrySet()){

            System.out.print(kv);
            System.out.print(",");
        }
    }




}
