import java.util.Scanner;
class TernaryOperator_14{
    public static void main(String[] args) {
        

        // variable = (condition) ? expressionTrue :  expressionFalse;

        int time =20;
        String result = (time <=18) ? "daytime" : "nighttime";
        System.out.println(result);




        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = scan.nextInt();
       
        
        char grade = (marks >75) ? 'A' : (marks >65) ? 'B' : (marks >55) ? 'C' : (marks >45) ? 'S' : 'F';
        System.out.println("Your grade is: " + grade);
        


    }
}