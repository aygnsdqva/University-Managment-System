package service;

import service.interfaces.sub.ExitServiceInterSub;
import util.color.ColorUtil;
import util.main.MainUtil;

public class ExitService implements ExitServiceInterSub {
    @Override
    public void process() {
        ColorUtil.showInGreen("You are logged out of your account...");
        MainUtil.isLoggedIn = false;

    }
}
