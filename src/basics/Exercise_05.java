import java.util.Scanner;


class Exercise_05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine(); // consume the newline left by nextInt()
        String address = scan.nextLine();

        System.out.println("Your name is:"+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your address is :"+address);


        

    }
}