package util.check;

import util.color.ColorUtil;
import util.main.MainUtil;
import util.scanner.ScannerUtil;

public class CheckerUtil {

    private  static  final  String text = "You have entered an incorrect number. Try again.";

    public  static  int  checkSelectedNumber(int selectedNumber){
        while (!MainUtil.isLoggedIn && (selectedNumber > 2 || selectedNumber<=0)){
            ColorUtil.showInRed(text);
            selectedNumber = ScannerUtil.intScanner("Please select the transaction number you want to make :");
        }
        while (MainUtil.isLoggedIn && (selectedNumber <=2 || selectedNumber >8 )){
            ColorUtil.showInRed(text);
            selectedNumber = ScannerUtil.intScanner("Please select the transaction number you want to make :");
        }
        return  selectedNumber;
    }
}
