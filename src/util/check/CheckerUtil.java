package util.check;

import util.color.ColorEnum;
import util.color.ColorUtil;
import util.color.FormatEnum;
import util.main.MainUtil;
import util.scanner.ScannerUtil;

public class CheckerUtil {

    private  static  final  String text = "You have entered an incorrect number. Try again.";

    public  static  int  checkSelectedNumber(int selectedNumber){
        while (!MainUtil.isLoggedIn && (selectedNumber > 2 || selectedNumber<=0)){
            ColorUtil.showFormatted(text, ColorEnum.ANSI_RED, FormatEnum.ANSI_BOLD);
            selectedNumber = ScannerUtil.intScanner("Please select the transaction number you want to make :");
        }
        while (MainUtil.isLoggedIn && (selectedNumber <=2 || selectedNumber >8 )){
            ColorUtil.showFormatted(text, ColorEnum.ANSI_RED, FormatEnum.ANSI_BOLD);
            selectedNumber = ScannerUtil.intScanner("Please select the transaction number you want to make :");
        }
        return  selectedNumber;
    }
}
