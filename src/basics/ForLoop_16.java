import java.util.Scanner;

class ForLoop_16 {
    public static void main(String[] args) {

        for (int i =0 ; i<5 ; i++) {
            System.out.println("Thanu");
        }

            /*
            Thanu
            Thanu
            Thanu
            Thanu
            Thanu
            */


        for (int i =15 ; i>8 ; i--){
            System.out.println(i);
        }

            /*
            15
            14
            13
            12
            11
            10
            9
             */


           
            
        for(int i= 1 ; i< 11 ; i++){
        System.out.println(i);
       }






   
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();


      for (; a<b; a++){
        System.out.println(a);
      }





      Scanner scan1 = new Scanner(System.in);
      int x = scan1.nextInt();
      int y = scan1.nextInt();

      for (int i = x; i < y; i++) {
      System.out.println(i);
      }






      
     
      for (int z=2; z<11; z++){

       if(z%2==0){
        System.out.println(z);
       }else{
        System.out.println("Odd");
       }


      


      }

     }


       
    }
