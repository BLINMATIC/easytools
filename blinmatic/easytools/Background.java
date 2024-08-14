package blinmatic.easytools;

public class Background 
{
    public static void clear() 
    {
        Console.printNoNewLine("\033[2J");
        Cursor.goHome();
    }
}
