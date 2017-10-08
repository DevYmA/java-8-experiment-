package lambda_expression.method_constructor_references;

public class PersonMain {

    public static void main(String[] args) {
        PersonFactory<Person> person = Person::new;
        person.create("John", "Luck");
    }
}
