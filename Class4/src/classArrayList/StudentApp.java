package classArrayList;

import java.util.Scanner;

public class StudentApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentManagement management = new StudentManagement();
    while (true) {
      if (enterStudents(scanner, management)) break;
    }
    management.listStudents();
  }

  private static boolean enterStudents(Scanner scanner, StudentManagement management) {
    String firstName = askInput("First Name:", scanner);
    if ("quit".equalsIgnoreCase(firstName)) {
      return true;
    }
    management.addStudent(
        new Student(firstName, askInput("Last Name:", scanner), askInput("Laptop Type:", scanner)));
    return false;
  }

  private static String askInput(String question, Scanner scanner) {
    System.out.println("Type student's " + question);
    return scanner.nextLine();
  }
}
