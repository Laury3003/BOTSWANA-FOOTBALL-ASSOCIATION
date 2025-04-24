// Utility.java
// Contains helper methods for structured user input, such as reading integers, doubles,
// strings, and booleans with prompts.

import java.util.Scanner;

public class Utility 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static double readDouble(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static String readLine(String prompt)
    {
        System.out.print(prompt);
        scanner.nextLine(); // Clear buffer
        return scanner.nextLine();
    }

    public static boolean readBoolean(String prompt) 
    {
        System.out.print(prompt + " (true/false): ");
        return scanner.nextBoolean();
    }
}