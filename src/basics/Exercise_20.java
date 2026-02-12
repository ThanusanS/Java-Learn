import java.util.Random;

class Exercise_20{
    public static void main(String[] args)
    {
        Random rand = new Random();    // create object
        int newnum =0;

      while(newnum!=5){
        newnum = rand.nextInt(10);    // genarate random number 0-9
        System.out.println(newnum);

      }


    }

}