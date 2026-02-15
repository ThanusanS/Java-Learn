     // Create a Main class
    public class Constructors_26 {
        int x;  // Create a class attribute

        // Create a class constructor for the Main class
        public Constructors_26() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            Constructors_26 myObj = new Constructors_26(); // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }
    }

    // Outputs 5




