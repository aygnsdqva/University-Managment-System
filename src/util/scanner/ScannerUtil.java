package util.scanner;

import util.color.ColorUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {
    public static String stringScanner(String title) {
        ColorUtil.showInBlue(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int intScanner(String title) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int a = -1;
        ColorUtil.showInBlue(title);
        while (!valid) {
            try {
                a = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException ex) {
                ColorUtil.showInRed("Invalid input. Please enter a number : ");
                scanner.next();
            }
        }
        return a;
    }
}
