package service;

import bean.Content;
import bean.Student;
import service.interfaces.sub.AddStudentServiceInterSub;
import util.banner.BannerUtil;
import util.color.ColorUtil;
import util.scanner.ScannerUtil;

import java.util.List;

public class AddStudentService implements AddStudentServiceInterSub {
    @Override
    public void process() {
        BannerUtil.addStudentBanner();
        List<Student> students = Content.getInstance().getStudents();
        int countOfStudents = ScannerUtil.intScanner("Enter the number of students you wish to register:");
        for (int i = 0; i < countOfStudents; i++) {
            System.out.println((i + 1) + " -> Student Registration");
            String name = ScannerUtil.stringScanner("Enter " + (i + 1) + ". Student Name");
            String surname = ScannerUtil.stringScanner("Enter " + (i + 1) + ". Student Surname");
            int grades = ScannerUtil.intScanner("Enter " + (i + 1) + ". Student Grades");
            Student student = new Student(name, surname, grades);
            students.add(student);
        }
        Content.getInstance().setStudents(students);
        Content.save();
        ColorUtil.showInGreen("Adding students successfully");
    }
}

