package classArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    while (true) {
      if (enterStudents(scanner, students)) break;
    }
    scanner.close();
    printStudents(students);
  }

  private static boolean enterStudents(Scanner scanner, List<Student> students) {
    String firstName = askInput("First Name:", scanner);
    if ("quit".equalsIgnoreCase(firstName)) {
      return true;
    }
    students.add(
        new Student(firstName, askInput("Last Name:", scanner), askInput("Laptop Type:", scanner)));
    return false;
  }

  private static void printStudents(List<Student> students) {
    System.out.println("These are students' info");
    students.forEach(
        v ->
            System.out.printf(
                "This is %s with a %s laptop. %n", v.getFullName(), v.getLaptopType()));
  }

  private static String askInput(String question, Scanner scanner) {
    System.out.println("Type student's " + question);
    return scanner.nextLine();
  }
}
