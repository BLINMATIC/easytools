package blinmatic.easytools;

public class Background {
    public static void clear() {
        Console.print_no_newline("\033[2J");
        Cursor.go_home();
    }
}
