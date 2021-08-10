package functional_interfaces;

public class FunctionExample1 {

    public static String performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);
    }

    public static String performConcatAndUpperCaseAndCompose(String str) {

        return FunctionExample.f1.compose(FunctionExample.addSomeString).apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println("Result is : " + result);

        result = performConcatAndUpperCaseAndCompose("lol");
        System.out.println("Result is : " + result);
    }
}
