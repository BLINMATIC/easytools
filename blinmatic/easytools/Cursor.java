package blinmatic.easytools;

public class Cursor 
{
    public static void goTo(int row, int column) 
    {
        Console.printNoNewLine("\033[" + row + ";" + column + "H");
    }

    public static void goHome() 
    {
        Console.printNoNewLine("\033[H");
    }

    public static void savePosition() 
    {
        Console.printNoNewLine("\033[s");
    }

    public static void loadPosition() 
    {
        Console.printNoNewLine("\033[u");
    }
}
