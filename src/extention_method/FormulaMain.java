package extention_method;

public class FormulaMain {

    public static void main(String[] args) {

        //This is a anonymous inner class
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        /*In this case,when we implement formula interface we have to override all
            abstract method(non-concrete),then that methods are inherited to implemented class.
            But default concrete method dosent' inherit to implemented class.but we can use sqrt
            method without inherit.
        * */

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));

    }
}
