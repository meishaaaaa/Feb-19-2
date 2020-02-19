import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("Linda", 18);
        Student stu2 = new Student("Cindy", 19);
        Student stu3 = new Student("Mary", 19);
        Student stu4 = new Student("Ben", 19);
        Student stu5 = new Student("Solider", 20);

        Map<String, Integer> stuList = new HashMap<>();
        stuList.put(stu1.getName(), stu1.getAge());
        stuList.put(stu2.getName(), stu2.getAge());
        stuList.put(stu3.getName(), stu3.getAge());

        Teacher tea = new Teacher();
        tea.setName("Bob");
        tea.setStu(stuList);

        tea.addStudent(stu4);
        tea.addStudent(stu5);

        Set<Map.Entry<String, Integer>> set = tea.getStu().entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String student = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(student + "," + age);
        }

    }

}
