import java.io.StringReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        ////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        String SSN = getRegExString(in, "enter your SSN", "\\d{3}-\\d{2}-\\d1{4}");
        System.out.println("Your ssn: " + SSN);



    }


    /**
     * Gets a string that matches a RegEX pattern like ###-##-#### \d{3}-\d{2}-\d{4}
     *
     * @param pipe Scanner to use for input
     * @param prompt String prompt to tell the user what to input
     * @param regEx A string that matches the regex formatting
     * @return
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;


        do {

            System.out.print(prompt + ":");
            retVal = pipe.nextLine();

            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("You must enter a string that matches the pattern" + regEx);
            }


        } while (!done);
        return retVal;
    }



}
