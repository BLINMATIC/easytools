package blinmatic.easytools;

import java.util.Scanner;

public class Console {
    public static void print(String text) {
        System.out.print("→ " + text + "\n");
    }
    public static void print_no_newline(String text) {
        System.out.print(text);
    }
    public static String input(String prompt) {
        Scanner reader = new Scanner(System.in);
        Console.print(prompt);
        Console.print_no_newline("↳ ");
        String out = reader.nextLine();
        reader.close();
        return out;
        
    }
}