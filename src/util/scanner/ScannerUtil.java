package util.scanner;

import util.color.ColorEnum;
import util.color.ColorUtil;
import util.color.FormatEnum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {
    public static String stringScanner(String title) {
        ColorUtil.showFormatted(title,ColorEnum.ANSI_BLUE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int intScanner(String title) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int a = -1;
        ColorUtil.showFormatted(title,ColorEnum.ANSI_BLUE);
        while (!valid) {
            try {
                a = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException ex) {
                ColorUtil.showFormatted("Invalid input. Please enter a number : ", ColorEnum.ANSI_RED);
                scanner.next();
            }
        }
        return a;
    }
}
