import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Integer, ArrayList<Student>> stuList = new HashMap<>();

    public Teacher() {
        stuList = new HashMap<>();
    }

    public Teacher(String name, Map<Integer, ArrayList<Student>> stu) {
        this.name = name;
        this.stuList = stuList;
    }

    public void addStudent(Student student) {
        Integer age = student.getAge();
        if (!stuList.containsKey(age)) {
            ArrayList<Student> stu = new ArrayList<>();
            stu.add(student);
            stuList.put(age,stu);
        }
        else {
            ArrayList<Student> stu=stuList.get(age);
            stu.add(student);
            stuList.put(age,stu);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, ArrayList<Student>> getStu() {
        return stuList;
    }


    public void setStuList( ArrayList<Student> stuList) {
        Map<Integer,ArrayList<Student>> stu=new HashMap<>();
        for (Student stu1:stuList){
            stu.put(stu1.getAge(),stuList);
        }
        this.stuList=stu;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", stuList=" + stuList +
                '}';
    }
}
