package lambda_expression;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

}
