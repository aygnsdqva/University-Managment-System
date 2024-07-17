package service;

import service.interfaces.sub.LoginServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorUtil;
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
                ColorUtil.showInGreen("Congratulations, you're logged in!");
                valid = true;
                MainUtil.isLoggedIn = true;
            }else {
                System.out.println();
                ColorUtil.showInRed("Wrong Username or password!");
                System.out.println();
                username  = ScannerUtil.stringScanner("Please enter again Username: ");
                password  = ScannerUtil.stringScanner("Please enter again Password: ");

            }
        }
    }
}
