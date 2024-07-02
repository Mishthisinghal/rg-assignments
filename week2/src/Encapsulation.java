class Person {
    // Private instance variables
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        setAge(age);  // Using setter to include validation
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Mishthi", 22);

        // Accessing and modifying Person object using getters and setters
        System.out.println("Initial details:");
        person.display();

        // Modifying the age using the setter
        person.setName("Mishthi Singhal");
        System.out.println("Modified details:");
        person.display();

        // Attempting to set an invalid age
        person.setAge(-5);
    }
}

