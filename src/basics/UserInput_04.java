import java.util.Scanner; // Step 1: Import the Scanner class

class UserInput_04 { // Class name starts with a letter
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Step 2: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 3: Read user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        


        Scanner num= new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int sum = a+b;
        System.out.println("The sum is: " + sum);

        // Step 4: Close the Scanner
        scanner.close();
        
    }
}
