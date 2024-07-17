package service;

import bean.Content;
import bean.Teacher;
import service.interfaces.sub.ShowAllTeacherServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorUtil;

import java.util.List;

public class ShowAllTeacherService implements ShowAllTeacherServiceInterSub {
    @Override
    public void process() {
        BannerUtil.AllTeacherListBanner();
        List<Teacher> teachers = Content.getInstance().getTeachers();
        if(teachers.isEmpty()){
            ColorUtil.showInRed("Unfortunately, no teacher was found in the system");
            return;
        }
        ColorUtil.showInGreen("Teachers List {");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("     " + (i+1) + ". " + teachers.get(i));
        }
        ColorUtil.showInGreen("}");
    }
}
