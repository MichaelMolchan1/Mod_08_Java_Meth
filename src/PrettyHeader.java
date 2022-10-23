public class PrettyHeader
{
    public static void main(String[] args) {
        prettyHeader("Dawg");






    }
    public static void prettyHeader(String msg)
    {
        int prettyMid = 30 -1 - msg.length();

        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("***");
        for (int i = 0; i < prettyMid; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < prettyMid; i++) {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();


        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }

    }

}
