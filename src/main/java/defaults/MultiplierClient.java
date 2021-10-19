package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1, 3, 5);

        int result = multiplier.multiply(integerList);
        System.out.println("Result is : " + result);
        System.out.println("default method size is: " + multiplier.size(integerList));
        System.out.println("static isEmpty: " + Multiplier.isEmpty(integerList));
    }
}
