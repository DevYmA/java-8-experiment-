package lambda_expression.lambda_scope;

import lambda_expression.Converter;

//Accessing fields and static variables
public class Lambda4 {

    static int outerStaticNum;
    int outerNum;


    void testScope(){
        Converter<Integer,String> converter1 = (from) -> {
            outerNum = 23;
            return  String.valueOf(from);
        };


        Converter<Integer,String> converter2 = (from) -> {
            outerStaticNum = 72;
            return  String.valueOf(from);
        };

    }
}
