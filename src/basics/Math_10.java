class Math_10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);


        int x=10;
        int y =5;

        Math.max(5, 10);
        Math.min(5, 10);



        System.out.println(Math.sqrt(64));

        System.out.println(Math.pow(2, 3));   // 2 raised to the power of 3 is 8.0

        System.out.println(Math.abs(-5));  // 5



        

        System.out.println(Math.random());  // Random number between 0.0 and 1.0
        System.out.println(Math.random() * 100);  // Random number between 0.0 and 100.0
        System.out.println((int)(Math.random() * 100));  // Random integer between 0 and 99
        System.out.println((int)(Math.random() * 100) + 1);  // Random integer between 1 and 100

        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);






        System.out.println(Math.round(3.6));  // 4
        System.out.println(Math.round(3.2));  // 3
        System.out.println(Math.round(3.5));  // 4

        System.out.println(Math.round(4.6));  // 5
        System.out.println(Math.ceil(4.1));   // 5.0
        System.out.println(Math.floor(4.9));  // 4.0


       


    }
}