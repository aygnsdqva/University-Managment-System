package service;

import service.interfaces.sub.LoginServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorEnum;
import util.color.ColorUtil;
import util.color.FormatEnum;
import util.main.MainUtil;
import util.scanner.ScannerUtil;

public class LoginService implements LoginServiceInterSub {

    @Override
    public void process() {
        BannerUtil.loginBanner();
        String username  = ScannerUtil.stringScanner("Please enter Username: ");
        String password  = ScannerUtil.stringScanner("Please enter Password: ");
        boolean valid = false;
        while (!valid){
            if(username.equals("Aygun") && password.equals("admin123")){
                ColorUtil.showFormatted("Congratulations, you're logged in!", ColorEnum.ANSI_GREEN, FormatEnum.ANSI_BOLD);
                valid = true;
                MainUtil.isLoggedIn = true;
            }else {
                System.out.println();
                ColorUtil.showFormatted("Wrong Username or password!",ColorEnum.ANSI_RED);
                System.out.println();
                username  = ScannerUtil.stringScanner("Please enter again Username: ");
                password  = ScannerUtil.stringScanner("Please enter again Password: ");

            }
        }
    }
}
