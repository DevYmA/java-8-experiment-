package extention_method;

public interface Formula {

    double calculate(int a);

    //If we use concrete method in interface of java 8, we have to use default access modify that
    default double sqrt(int a){
        return Math.sqrt(a);
    }

}
