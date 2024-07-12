interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int sum = MathOperations.add(5, 3);       // Calling static method add()
        int product = MathOperations.multiply(5, 3); // Calling static method multiply()

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

