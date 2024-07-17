package util.main;
import util.banner.BannerUtil;
import util.color.ColorUtil;
import util.menu.MenuUtil;

public class MainUtil {
    public  static boolean isLoggedIn;
    public  static  void mainStart(){
        BannerUtil.menuBanner();
        ColorUtil.showInPurple("Welcome!!!");
        MenuUtil.ShowMenu();
    }
}
