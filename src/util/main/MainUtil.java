package util.main;
import util.banner.BannerUtil;
import util.color.ColorEnum;
import util.color.ColorUtil;
import util.color.FormatEnum;
import util.menu.MenuUtil;

public class MainUtil {
    public  static boolean isLoggedIn;
    public  static  void mainStart(){
        BannerUtil.menuBanner();
        ColorUtil.showFormatted("Welcome!!!", ColorEnum.ANSI_PURPLE, FormatEnum.ANSI_BOLD);
        MenuUtil.ShowMenu();
    }
}
