class Switch_15 {
    public static void main(String[] args) {
        int day =44;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Looking forward to the Weekend");                  

             
        }


            int choice = 1;

            // 1 = Coffee
            // 2 = Tea

            switch (choice) {
            case 1:
                System.out.println("You ordered Coffee");
                break;

            case 2:
                System.out.println("You ordered Tea");
                break;

            default:
                System.out.println("Invalid choice");
            }
    }
}