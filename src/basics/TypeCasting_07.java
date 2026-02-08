class TypeCasting_07 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0


        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myInt2);   // Outputs 9 (decimal part is truncated)

        

        // Set the maximum possible score in the game to 500
                
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);
    }
}