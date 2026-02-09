import java.util.Scanner;

class Exercise_13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = scan.nextInt();


        char a= 'A';
        char b= 'B';
        char c='C';
        char s='S';


        if (marks >75){
          System.out.println(a);
        }else if (marks>65) {
          System.out.println(b);
        }else if (marks>55){
            System.out.println(c);
        }else if (marks>45){
            System.out.println(s);
        }else {
            System.out.println("Fail");
        }



    }
}