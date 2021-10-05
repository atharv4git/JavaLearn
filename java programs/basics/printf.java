public class printf {
    public static void main(String[] args) {
        //  printf() = an optional method to control , format and display text to the console window.
        //  tho arguments = format string + (object/var/value)
        //  % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "atharv";
        int myInt = 123;
        double myDouble = 45000;

        System.out.println("\n*************************************");

        //[conversion characters]
        System.out.printf("%b , %c , %s , %d , %f",myBoolean , myChar , myString , myInt , myDouble);

        System.out.println("\n*************************************");

        //[width]
        //minimum number of characters to be writen as output
        System.out.printf("hello %10s",myString);

        System.out.println("\n*************************************");

        //[precision]
        //sets no. of digits of precision when outputting floatong-point values
        System.out.printf("you have %.2f rupees left in your bank account" , myDouble);

        System.out.println("\n*************************************");

        //[flags]
        //adds an effect to ooutput based on the flag added to format specifier
        // - : leftjustify
        // + : output a plus or minus sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping seperator if numbers > 1000

        System.out.printf("you have %,f rupees left in your bank account" , myDouble);

        System.out.println("\n*************************************");
        
    }
}
