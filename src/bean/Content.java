package bean;

import util.file.FileUtil;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import java.util.ArrayList;

public class Content implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String fileName = "content.obj";
    private static Content content = null;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Content{" +
                "students=" + students +
                ", teachers=" + teachers +
                '}';
    }

    public static void initialize() {
        File file = new File(fileName);
        if (!file.exists() || file.length() == 0) {
            return;
        }
        Object obj = FileUtil.readFileDeserialize(fileName);
        if (obj == null) {
            return;
        }
        if (obj instanceof Content) {
            content = (Content) obj;
        }
    }


    public static void save() {
        if (content != null) {
            FileUtil.writeObjectToFile(content, fileName);
        }
    }

    public static Content getInstance() {
        if (content == null) {
            content = new Content();
        }
        return content;
    }
}


