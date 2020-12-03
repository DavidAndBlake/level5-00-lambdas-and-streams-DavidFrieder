package _01_Lambda_Methods;

public class LambdaMethods
{
    private static String printable = new String();

    public static void main(String[] args)
    {
        // 1. Look at the SpecialPrinter function interface.

        // Here is an example of calling the printCustomMessage method with a lambda.
        // This prints the passed in String 10 times.
        printCustomMessage((s) ->
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println(s);
            }
        }, "repeat");

        //2. Call the printCustomMessage method using a lambda so that the String prints backwards.
        printCustomMessage((s) ->
        {
            for (int i = s.length() - 1; i > -1; i--)
            {
                printable += (s.substring(i, i + 1));
            }
            System.out.println(printable);
        }, "backwards");

        //3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper an lower case characters.

        printCustomMessage((s) ->
        {
            printable = "";
            for (int i = 0; i < 10; i++)
            {
                if (i % 2 == 0)
                {
                    printable += (s.substring(i, i + 1).toUpperCase());
                } else
                {
                    printable += (s.substring(i, i + 1).toLowerCase());
                }
            }
            System.out.println(printable);
        }, "mixed case");

        //4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.

        printCustomMessage((s) ->
        {
            printable = "";
            for (int i = 0; i < s.length(); i++)
            {
                printable += (s.substring(i, i + 1) + ".");
            }
            System.out.println(printable);
        }, "add periods");

        //5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.

		//TODO: Check to make sure this is working.
        printCustomMessage((s) ->
        {
            printable = "";
            for (int i = 0; i < s.length(); i++)
            {
                if (!s.substring(i, i + 1).equalsIgnoreCase("a") && (!s.substring(i, i + 1).equalsIgnoreCase("e") &&
                        (!s.substring(i, i + 1).equalsIgnoreCase("i") &&
                                (!s.substring(i, i + 1).equalsIgnoreCase("o") && (!s.substring(i, i + 1).equalsIgnoreCase("u"))))))
                {
					printable += s.substring(i,i+1);
                }
            }
			System.out.println(printable);
        }, "no vowels");

    }

    public static void printCustomMessage(SpecialPrinter sp, String value)
    {
        sp.printSpecial(value);
    }
}
	
