package service;

import service.interfaces.sub.QuitServiceInterSub;
import util.color.ColorUtil;

public class QuitService implements QuitServiceInterSub {
    @Override
    public void process() {
        ColorUtil.showInRed("System Suspended");
        System.exit(0);
    }
}
