import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Using map to convert each string to uppercase
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the list of uppercase words
        System.out.println("Original List: " + words);
        System.out.println("Uppercase List: " + uppercaseWords);
    }
}

