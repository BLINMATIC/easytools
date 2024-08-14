package blinmatic.easytools;

public class TextStyling 
{
    public static void resetAll() 
    {
        Console.printNoNewLine("\033[0m");
    }

    public static void setBold() 
    {
        Console.printNoNewLine("\033[1m");
    }

    public static void resetBold() 
    {
        Console.printNoNewLine("\033[22m");
    }

    public static void setDim() 
    {
        Console.printNoNewLine("\033[2m");
    }

    public static void resetDim() 
    {
        Console.printNoNewLine("\033[22m");
    }

    public static void setItalic() 
    {
        Console.printNoNewLine("\033[3m");
    }

    public static void resetItalic() 
    {
        Console.printNoNewLine("\033[23m");
    }

    public static void setUnderline()
    {
        Console.printNoNewLine("\033[4m");
    }

    public static void resetUnderline() 
    {
        Console.printNoNewLine("\033[24m");
    }

    public static void setBlink() 
    {
        Console.printNoNewLine("\033[5m");
    }

    public static void resetBlink() 
    {
        Console.printNoNewLine("\033[25m");
    }

    public static void setInverse() 
    {
        Console.printNoNewLine("\033[7m");
    }

    public static void resetInverse() 
    {
        Console.printNoNewLine("\033[27m");
    }

    public static void setHidden() 
    {
        Console.printNoNewLine("\033[8m");
    }

    public static void resetHidden()
    {
        Console.printNoNewLine("\033[28m");
    }

    public static void setStriketrough() 
    {
        Console.printNoNewLine("\033[9m");
    }

    public static void resetStriketrough() 
    {
        Console.printNoNewLine("\033[29m");
    }
}
