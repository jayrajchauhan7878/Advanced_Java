package may21;

import java.util.function.Consumer;

public class AcceptConsumer {

    public void acceptConsumer(Consumer<String> consumer) {
        consumer.accept("Jay"); // Invoking the consumer
    }

    public static void main(String[] args) {
        AcceptConsumer ac = new AcceptConsumer();

        // Creating a Consumer<String> to pass to acceptConsumer method
        Consumer<String> consumer = (name) -> System.out.println("Hello, " + name);

        // Invoking acceptConsumer with the created consumer
        ac.acceptConsumer(consumer);
    }
}


