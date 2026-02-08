import java.util.Scanner; // Step 1: Import the Scanner class
class Exercise_06{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = scan.nextDouble();

        int d = a*b*(int)c;
        int e = a+b+(int)c;
        System.out.println(d/e);
        

    }
}