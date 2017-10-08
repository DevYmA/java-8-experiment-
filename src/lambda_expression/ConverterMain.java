package lambda_expression;

public class ConverterMain {
    public static void main(String[] args) {

        Converter<String,Integer> converter = (from) -> Integer.valueOf(from);
        //Simplify above statement utilizing static method references;
        //Converter<String,Integer> converter = Integer::valueOf;
        Integer convertedValue = converter.convert("1000");
        System.out.println(convertedValue);

    }
}
