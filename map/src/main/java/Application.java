import java.util.*;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("Linda", 18);
        Student stu2 = new Student("Cindy", 19);
        Student stu3 = new Student("Mary", 19);
        Student stu4 = new Student("Ben", 19);
        Student stu5 = new Student("Solider", 20);

        ArrayList<Student>stuList=new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        Teacher tea = new Teacher();
        tea.setName("Bob");
        tea.setStuList(stuList);

        tea.addStudent(stu4);
        tea.addStudent(stu5);

        System.out.println(tea.getStu());

        }


}
