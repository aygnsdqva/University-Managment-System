package main;

import bean.Content;
import util.main.MainUtil;

public class Main {
    public static void main(String[] args) {
        Content.initialize();
        MainUtil.mainStart();
    }
}
