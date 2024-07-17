package menu;

import service.*;
import service.interfaces.MenuServiceInter;

public enum MenuEnum {
    LOGIN(1,"Login",new LoginService()),
    REGISTER(2,"Register",new RegisterService()),
    ADD_STUDENT(3,"Add Student", new AddStudentService()),
    ADD_TEACHER(4,"Add Teacher", new AddTeacherService()),
    SHOW_ALL_STUDENT(5,"Show All Student", new ShowAllStudentService()),
    SHOW_ALL_TEACHER(6,"Show All Teacher", new ShowAllTeacherService()),
    EXIT(7,"Exit", new ExitService()),
    QUIT(8,"Quit", new QuitService()),
    UNKNOWN;

    private  int number;
    private  String label;
    private  MenuServiceInter menuServiceInter;

    MenuEnum() {
    }

    MenuEnum(int number, String label, MenuServiceInter menuServiceInter) {
        this.number = number;
        this.label = label;
        this.menuServiceInter = menuServiceInter;

    }

    @Override
    public String toString() {
        return number + ". " +label ;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    public void  process(){
        menuServiceInter.process();
    }
}
