package util.menu;

import menu.MenuEnum;
import util.check.CheckerUtil;
import util.main.MainUtil;
import util.scanner.ScannerUtil;

public class MenuUtil {
    public static void ShowMenu() {
        System.out.println();
        System.out.println("Menu: ");
        MenuEnum[] menuEnums = MenuEnum.values();
        for (int i = 0; i < menuEnums.length - 1; i++) {
            if (menuEnums[i].getNumber() == 1 || menuEnums[i].getNumber() == 2) {
                if(!MainUtil.isLoggedIn){
                    System.out.println(menuEnums[i]);
                }
            } else if (MainUtil.isLoggedIn) {
                System.out.println(menuEnums[i]);
            }
        }
        MenuUtil.chooseMenu();
    }
    public  static  void chooseMenu(){
        int selectedNumber = ScannerUtil.intScanner("Please select the transaction number you want to make :");
        selectedNumber = CheckerUtil.checkSelectedNumber(selectedNumber);

        MenuEnum[] menuEnums = MenuEnum.values();
        for (int i = 0; i < menuEnums.length-1; i++) {
            if(menuEnums[i].getNumber() == selectedNumber){
                menuEnums[i].process();
            }
        }
        MenuUtil.ShowMenu();
    }
}
