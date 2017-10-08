package lambda_expression;

import java.util.function.Function;

public class Funtion {

    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        System.out.println(backToString.apply("Hello"));
    }
}
