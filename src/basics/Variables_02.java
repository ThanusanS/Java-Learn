class Variables_02{
    public static void main (String[] args)
    {
        int container =67;
        System.out.println(container);
        String cont= "Thanusan";
        System.out.println(cont);



        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z); // 61





        // Calculate the Area of a Rectangle

        int length= 6;
        int width=4;
        int area;

        area= length* width;

        System.out.println("The area of the rectangle is:" +area);
    }
}


/*

In Java, there are different types of variables, for example:

✅ String - stores text, such as "Hello". String values are surrounded by double quotes
✅ int - stores integers (whole numbers), without decimals, such as 123 or -123
✅ float - stores floating point numbers, with decimals, such as 19.99 or -19.99
✅ char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
✅ boolean - stores values with two states: true or false

int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);


final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable


// Invalid identifiers:
int 2ndNumber = 5;  // Cannot start with a digit
int my var = 10;    // Cannot contain spaces
int int = 20;       // Cannot use reserved keywords


When to Use final?
You should declare variables as final when their values should never change. For example, the number of minutes in an hour, or your birth year:


*/



