package lambda_expression.lambda_scope;

import lambda_expression.Converter;

public class LocalVarialbleMain {

    public static void main(String[] args) {

        final int a = 10;
        Converter<Integer, String> converter = from -> String.valueOf(from + a);
        System.out.println(converter.convert(2));

        /*
            int a = 10;
            Converter<Integer, String> converter = from -> String.valueOf(from + a);
            System.out.println(converter.convert(2));
            a =9;//dosent' compile above code
        */

        //we haven't access default method in functional interface in lambda expression
    }
}
