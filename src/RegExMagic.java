import java.util.Scanner;
public class RegExMagic
{
    public static void main(String[] args)
    {

        // Var Declarations
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCID = "";
        String menu = "";

        SSN = SafeInput.getRegExString(in,"What Is your ssn ###-##-#### ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You entered " + SSN);
        UCID = SafeInput.getRegExString(in,"What Is your MID M##### ", "(M|m)\\d{5}");
        System.out.println("You entered " + UCID);
        menu = SafeInput.getRegExString(in,"Which option would you like to select? [OoSsVvQq]", "[OoSsVvQq]");
        System.out.println("You selected " + menu);



    }


}
