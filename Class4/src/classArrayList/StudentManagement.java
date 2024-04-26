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

  public void removeStudent(String name) {
    students.removeIf(v -> name.equalsIgnoreCase(v.getFullName()));
  }

  public void removeStudent() {
    students.clear();
  }

  public void listStudents() {
    System.out.println("Here are students' info:");
    for (int i = 0; i < students.size(); i++) {
      System.out.printf(
          "%s. %s has a %s\n",
          i + 1, students.get(i).getFullName(), students.get(i).getLaptopType());
    }
  }
}
