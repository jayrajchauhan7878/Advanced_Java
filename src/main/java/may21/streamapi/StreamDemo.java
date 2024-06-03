package may21.streamapi;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(20,45,56,76,34,23,66,77,88,98,23);

       Stream<Integer> numbserStream = numbers.stream();

        List<String> oddNUmber = numbserStream.filter(n -> n % 2 != 0).map(i -> i*i).map(s -> String.valueOf(s)).map(a -> a+a).collect(Collectors.toList());
        System.out.println(oddNUmber);

    }
}
