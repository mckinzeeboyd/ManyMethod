import static java.lang.System.out;
import java.util.Scanner;

/**
 * This assignment has you practice writing functions.  Test cases are provided
 * in code, so when you run the program, it will tell you if the functions
 * are working right.
 * 
 * Instructions
 * 
 * 1. Read all of the code all the way through.
 * 2. Figure out what should be in the _____ areas.  Fix them for all the methods, so the code will compile.
 * 3. Compile the code to check your work on data types and names.
 * 4. Figure out what code belongs in the // TODO areas.  Write that code, one function at a time.
 * 5. Compile and run frequently as you work, noting your progress through the test cases.
 * 6. Keep going until they're all written and the tests cases all pass.
 * 7. Celebrate!
 * 
 */
public class ManyMethods
{
    Scanner keyboard = new Scanner(System.in);
    
    /**
     * Takes two integer numbers as input and returns whichever number is smaller.
     */
    public static int minimum(int a, int b)
    {
        if (a<b) {
            return a;
        } else if (a>b) {
            return b;
        }
            return 0;
    }

    /**
     * Takes two integer numbers as input and returns whichever number is larger.
     */
    public static int maximum(int a, int b)
    {
        if (a>b) {
            return a;
        } else if (a<b) {
            return b;
        }
            return 0;
    }

    /**
     * Returns true if the integer input is an odd number (1, 3, 5, 7...)
     */
    public static String isOddNumber(int a)
    {
        if (a%2==0) {
            return "false";
        } else if (a%2 !=0) {
            return "true";
        }
            return "ERROR";
    }

    /**
     * Returns true if the integer input is an even number (0, 2, 4, 6, 8...)
     */
    public static String isEvenNumber(int a)
    {
        if (a%2==0) {
            return "true";
        } else if (a%2 !=0) {
            return "false";
        }
            return "ERROR";
    }
    
    public static void main(String [] args) {
        out.println(minimum(3,5));
        out.println(maximum(5,3));
        out.println(isOddNumber(7));
        out.println(isEvenNumber(6));
        
    }
}