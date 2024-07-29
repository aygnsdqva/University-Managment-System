package service;

import service.interfaces.sub.QuitServiceInterSub;
import util.color.ColorEnum;
import util.color.ColorUtil;
import util.color.FormatEnum;

public class QuitService implements QuitServiceInterSub {
    @Override
    public void process() {
        ColorUtil.showFormatted("System Suspended", ColorEnum.ANSI_RED, FormatEnum.ANSI_BOLD,FormatEnum.ANSI_BLINK);
        System.exit(0);
    }
}
