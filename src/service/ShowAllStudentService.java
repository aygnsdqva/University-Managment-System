package service;

import bean.Content;
import bean.Student;
import service.interfaces.sub.ShowAllStudentServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorEnum;
import util.color.ColorUtil;
import util.color.FormatEnum;

import java.util.List;

public class ShowAllStudentService implements ShowAllStudentServiceInterSub {
    @Override
    public void process() {
        BannerUtil.AllStudentListBanner();
        List<Student> students = Content.getInstance().getStudents();
        if (students.isEmpty()) {
            ColorUtil.showFormatted("Unfortunately, no student was found in the system", ColorEnum.ANSI_RED, FormatEnum.ANSI_UNDERLINE);
            return;
        }
        ColorUtil.showFormatted("Students List {",ColorEnum.ANSI_GREEN);
        for (int i = 0; i < students.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + students.get(i));
        }
        ColorUtil.showFormatted("}",ColorEnum.ANSI_GREEN);
    }
}

