package blinmatic.easytools;

import java.util.Scanner;

public class Console 
{
    public static void print(String text) 
    {
        System.out.print("→ " + text + "\n");
    }

    public static void printNoNewLine(String text) 
    {
        System.out.print(text);
    }

    public static String input(String prompt) 
    {
        Scanner reader = new Scanner(System.in);

        Console.print(prompt);
        Console.printNoNewLine("↳ ");

        String out = reader.nextLine();

        reader.close();
        return out;
    }
}