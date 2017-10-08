package lambda_expression.predicates;

import lambda_expression.method_constructor_references.Person;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        Consumer<Person> personConsumer = (p) -> System.out.println("Hello, "+p.getFirstName());
        personConsumer.accept(new Person("John", "Henri"));
    }
}
