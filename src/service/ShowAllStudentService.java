package service;

import bean.Content;
import bean.Student;
import service.interfaces.sub.ShowAllStudentServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorUtil;

import java.util.List;

public class ShowAllStudentService implements ShowAllStudentServiceInterSub {
    @Override
    public void process() {
        BannerUtil.AllStudentListBanner();
        List<Student> students = Content.getInstance().getStudents();
        if (students.isEmpty()) {
            ColorUtil.showInRed("Unfortunately, no student was found in the system");
            return;
        }
        ColorUtil.showInGreen("Students List {");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + students.get(i));
        }
        ColorUtil.showInGreen("}");
    }
}

