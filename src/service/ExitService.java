package service;

import service.interfaces.sub.ExitServiceInterSub;
import util.color.ColorEnum;
import util.color.ColorUtil;
import util.main.MainUtil;

public class ExitService implements ExitServiceInterSub {
    @Override
    public void process() {
        ColorUtil.showFormatted("You are logged out of your account...", ColorEnum.ANSI_GREEN);
        MainUtil.isLoggedIn = false;

    }
}
