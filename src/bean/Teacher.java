package bean;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {

    private  static final  long serialVersionUID = 1L;
    private int salary;

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public Teacher(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getSurname() +
                " - > salary=" + salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
