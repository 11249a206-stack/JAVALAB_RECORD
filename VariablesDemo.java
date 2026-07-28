public class VariablesDemo {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static String staticVar = "I am static";

    // Method to display variables
    public void showVariables() {
        // Local variable
        int localVar = 5;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    // Main method
    public static void main(String[] args) {
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        System.out.println("Accessing Static Variable via class: "
                + VariablesDemo.staticVar);
    }
}