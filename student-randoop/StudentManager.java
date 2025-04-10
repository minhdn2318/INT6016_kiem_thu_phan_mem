import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentManager {
    private Set<Student> students = new HashSet<>();
    private Map<Student, List<Course>> registrations = new HashMap<>();

    public void addStudent(Student s) {
        if (students.contains(s)) throw new IllegalArgumentException("Student already exists");
        students.add(s);
        registrations.put(s, new ArrayList<>());
    }

    public void registerCourse(Student s, Course c) {
        if (!students.contains(s)) throw new IllegalArgumentException("Student not found");
        List<Course> courses = registrations.get(s);
        if (courses.contains(c)) throw new IllegalArgumentException("Already registered");
        courses.add(c);
    }

    public List<Course> getCourses(Student s) {
        if (!students.contains(s)) throw new IllegalArgumentException("Student not found");
        return new ArrayList<>(registrations.get(s));
    }

    public int getTotalStudents() {
        return students.size();
    }
}
