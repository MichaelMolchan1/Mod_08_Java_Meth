import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        int favInt;
        double favDouble;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "enter your favorite double");
        System.out.print("You said your favorite integer is " + favInt + " and that your favorite double is " + favDouble);

    }
}
