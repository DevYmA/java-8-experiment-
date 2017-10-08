package lambda_expression.method_constructor_references;

import lambda_expression.Converter;

public class SomethingDemo {

    public static void main(String[] args) {

        Something something = new Something();
        Converter <String, String> converter = something::startWith;
        String converted = converter.convert("Java");
        System.out.println(converted);
    }
}
