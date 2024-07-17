package bean;

import java.io.Serializable;

public class Student extends Person implements Serializable {

    private  static final  long serialVersionUID = 1L;
    private int grades;

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Student(String name, String surname, int grades) {
        super(name, surname);
        this.grades = grades;
    }


    @Override
    public String toString() {
        return super.getName() + " " + super.getSurname() +
                " - > grades=" + grades;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
