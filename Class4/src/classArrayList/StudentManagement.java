package classArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
  List<Student> students = new ArrayList<>();

  public void addStudent(Student student) {
    students.add(student);
  }

  public void removeStudent(int index) {
    students.remove(index);
  }

  public void listStudents() {
    students.forEach(v -> System.out.printf("%s has a %s\n", v.getFullName(), v.getLaptopType()));
  }
}
