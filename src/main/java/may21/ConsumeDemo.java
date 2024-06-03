package may21;

import java.util.function.Consumer;

public class ConsumeDemo {


    public void acceptNameConsumer(Consumer<String> consumer){

        consumer.accept("Hello");
    }

    public static void main(String[] args) {

        ConsumeDemo ac = new ConsumeDemo();

        Consumer<String> consumer = (name) -> System.out.println("Hello"+name);

        ac.acceptNameConsumer(consumer);
    }
}
