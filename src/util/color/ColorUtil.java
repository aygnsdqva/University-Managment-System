package util.color;

public class ColorUtil {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    public  static void showInRed(String text){
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }
    public  static void showInGreen(String text){
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }
    public  static void showInBlue(String text){
        System.out.println(ANSI_BLUE + text + ANSI_RESET);
    }
    public  static void showInYellow(String text){
        System.out.println(ANSI_YELLOW + text + ANSI_RESET);
    }

    public  static void showInPurple(String text){
        System.out.println(ANSI_PURPLE + text + ANSI_RESET);
    }




}
