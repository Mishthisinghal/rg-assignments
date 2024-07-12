import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");

        // Creating an Optional with a nullable value
        Optional<String> emptyOptional = Optional.ofNullable(null);

        // Checking if value is present and printing it
        nonEmptyOptional.ifPresent(System.out::println);

        // Providing a default value if the Optional is empty
        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println(defaultValue);

        // Using map to transform the value if present
        Optional<Integer> length = nonEmptyOptional.map(String::length);
        length.ifPresent(System.out::println);
    }
}

