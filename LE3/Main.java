public class Main {
    public static void main(String[] args) {
        // Test the concrete class
        Test test = new Test();
        test.display();

        // Test the abstract class (cannot instantiate directly)
        // AbsTest absTest = new AbsTest(); // This will cause a compilation error
    }
}