package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable() {

        Optional<String> stringOptional = Optional.ofNullable("Hello");
//        Optional<String> stringOptional = Optional.ofNullable(null);

        return stringOptional;
    }

    public static Optional<String> of() {

        Optional<String> stringOptional = Optional.of("Hello");
//        Optional<String> stringOptional = Optional.of(null);

        return stringOptional;
    }

    public static Optional<String> empty() {

        Optional<String> stringOptional = Optional.empty();
        return stringOptional;
    }

    public static void main(String[] args) {
        System.out.println(ofNullable());
        System.out.println(of());
        System.out.println(empty());
    }

}
