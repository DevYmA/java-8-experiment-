package lambda_expression;

import lambda_expression.method_constructor_references.Person;

import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;

        System.out.println(personSupplier.get());
    }
}
