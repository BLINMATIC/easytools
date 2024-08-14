package blinmatic.easytools;

public class Cursor {
    public static void go_to(int row, int column) {
        Console.print_no_newline("\033[" + row + ";" + column + "H");
    }
    public static void go_home() {
        Console.print_no_newline("\033[H");
    }
    public static void save_pos() {
        Console.print_no_newline("\033[s");
    }
    public static void load_pos() {
        Console.print_no_newline("\033[u");
    }
}
