package service;

import bean.Content;
import bean.Teacher;
import service.interfaces.sub.AddTeacherServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorUtil;
import util.scanner.ScannerUtil;

import java.util.List;

public class AddTeacherService implements AddTeacherServiceInterSub {
    @Override
    public void process() {
        BannerUtil.addTeacherBanner();
        List<Teacher> teachers = Content.getInstance().getTeachers();
        int countOfTeachers = ScannerUtil.intScanner("Enter the number of teachers you wish to register:");
        for (int i = 0; i < countOfTeachers; i++) {
            System.out.println(i + 1 + " -> Teacher Registration");
            String name = ScannerUtil.stringScanner("Enter " + (i+1) + ". " +"Teacher Name");
            String surname = ScannerUtil.stringScanner("Enter " + (i+1) + ". " + "Teacher Surname");
            int salary = ScannerUtil.intScanner("Enter " + (i+1) + ". " + "Teacher Grades");
            Teacher teacher = new Teacher(name,surname,salary);
            teachers.add(teacher);
        }
        Content.getInstance().setTeachers(teachers);
        Content.save();
        ColorUtil.showInGreen("Adding teachers successfully");
    }
}
