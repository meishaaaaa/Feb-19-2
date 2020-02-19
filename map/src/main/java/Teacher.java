import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Teacher {
    private String name;
    private Map<String, Integer> stu = null;

    public Teacher() {
        stu = new HashMap<>();
    }

    public Teacher(String name, Map<String, Integer> stu) {
        this.name = name;
        this.stu = stu;
    }

    public void addStudent(Student student) {
        Integer age = student.getAge();
        String name = student.getName();
        stu.put(name, age);
    }

    public void sortStudent(Map<String, Integer> stu) {
        Map<Integer, List<Entry<String, Integer>>> result = stu.entrySet().stream().collect(Collectors.groupingBy(c -> c.getValue()));
        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getStu() {
        return stu;
    }

    public void setStu(Map<String, Integer> stu) {
        this.stu = stu;
    }
}
