class Exercise_24{
    
    

    int apple_price=500;
    int apple_count=5;
    int total_money= (apple_price*apple_count);
    


    // Create Method
    void total_price(){
       System.out.println(total_money);
    }





    // Calling Method
    public static void main(String[] args){
        Exercise_24 obj1 = new  Exercise_24(); // Create Object
        obj1.total_price();
    }
}