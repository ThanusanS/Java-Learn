class String_09 {
    public static void main(String[] args) {
        //String Length
        String str = "Hello";
        int length = str.length();
        System.out.println("The length of the string is: " + length);   // The length of the string is: 5




        //String Indexing
        String txt = "Hello";
        System.out.println(txt.charAt(0));  // H
        System.out.println(txt.charAt(4));  // o




        //Finding a String in a String
        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate")); // Outputs 7




        //The toUpperCase() method converts a string to upper case letters.
        //The toLowerCase() method converts a string to lower case letters.
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"




        //Comparing Strings
        String txt5 = "Hello";
        String txt6 = "Hello";

        String txt7 = "Greetings";
        String txt8 = "Great things";

        System.out.println(txt5.equals(txt6));  // true
        System.out.println(txt7.equals(txt8));  // false



    }
}