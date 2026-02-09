import java.util.Scanner;
class Exercise_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int num1= scan.nextInt();
        System.out.print("Enter a number 2: ");
        int num2 = scan.nextInt();

        if (num1==num2){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are not equal");

         }







        // use equals() method to compare strings

        String name= "Thanu";

        if (name.equals("Thanu")){
            System.out.println("Welcome, Thanu!");
        } else {
            System.out.println("You are not Thanu.");
           
        }

       
    }
}
