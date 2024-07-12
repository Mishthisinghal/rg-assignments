import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // List of strings
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        // Using a lambda expression to filter names starting with "J"
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);
    }
}
