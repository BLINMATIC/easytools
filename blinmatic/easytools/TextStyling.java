package blinmatic.easytools;

public class TextStyling {
    public static void reset_all() {
        Console.print_no_newline("\033[0m");
    }
    public static void set_bold() {
        Console.print_no_newline("\033[1m");
    }
    public static void reset_bold() {
        Console.print_no_newline("\033[22m");
    }
    public static void set_dim() {
        Console.print_no_newline("\033[2m");
    }
    public static void reset_dim() {
        Console.print_no_newline("\033[22m");
    }
    public static void set_italic() {
        Console.print_no_newline("\033[3m");
    }
    public static void reset_italic() {
        Console.print_no_newline("\033[23m");
    }
    public static void set_underline() {
        Console.print_no_newline("\033[4m");
    }
    public static void reset_underline() {
        Console.print_no_newline("\033[24m");
    }
    public static void set_blink() {
        Console.print_no_newline("\033[5m");
    }
    public static void reset_blink() {
        Console.print_no_newline("\033[25m");
    }
    public static void set_inverse() {
        Console.print_no_newline("\033[7m");
    }
    public static void reset_inverse() {
        Console.print_no_newline("\033[27m");
    }
    public static void set_hidden() {
        Console.print_no_newline("\033[8m");
    }
    public static void reset_hidden() {
        Console.print_no_newline("\033[28m");
    }
    public static void set_striketrough() {
        Console.print_no_newline("\033[9m");
    }
    public static void reset_striketrough() {
        Console.print_no_newline("\033[29m");
    }
}
