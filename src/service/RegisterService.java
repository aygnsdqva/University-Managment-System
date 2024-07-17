package service;

import service.interfaces.sub.RegisterServiceInterSub;
import util.banner.BannerUtil;
import util.main.MainUtil;

public class RegisterService implements RegisterServiceInterSub {
    @Override
    public void process() {
        BannerUtil.registerBanner();
        MainUtil.isLoggedIn = true;
    }
}
