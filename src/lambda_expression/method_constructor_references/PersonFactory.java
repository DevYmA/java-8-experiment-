package lambda_expression.method_constructor_references;

public interface PersonFactory <P extends  Person> {

    P create(String fistName, String secondName);

}
