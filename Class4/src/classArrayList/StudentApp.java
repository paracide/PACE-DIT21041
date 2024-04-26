package classArrayList;

import java.util.Scanner;

public class StudentApp {
  private static final int ADD_STUDENT = 1;
  private static final int REMOVE_STUDENT = 2;
  private static final int REMOVE_STUDENT_BY_NAME = 3;
  private static final int REMOVE_ALL_STUDENT = 4;
  private static final int LIST_STUDENT = 5;
  private static final int EXIT_STUDENT_APP = 6;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentManagement management = new StudentManagement();
    while (true) {
      System.out.print(
          "\n1. Add Students\n2. Del Students\n5. Show Students\n6. Exit Students\nSelect an option:");
      int option = Integer.parseInt(scanner.nextLine());
      if (option == 6) {
        break;
      }
      switch (option) {
        case ADD_STUDENT:
          addStudent(scanner, management);
          break;
        case REMOVE_STUDENT:
          delStudent(scanner, management);
          break;
        case LIST_STUDENT:
          management.listStudents();
          break;
      }
    }
  }

  private static void addStudent(Scanner scanner, StudentManagement management) {
    while (true) {
      String firstName = askInput("Type student's First Name:", scanner);
      if ("quit".equalsIgnoreCase(firstName)) {
        break;
      }
      management.addStudent(
          new Student(
              firstName,
              askInput("Type student's Last Name:", scanner),
              askInput("Type student's Laptop Type:", scanner)));
    }
  }

  private static void delStudent(Scanner scanner, StudentManagement management) {
    management.listStudents();
    int index = Integer.parseInt(askInput("Type the index of the student to remove: ", scanner));
    management.removeStudent(index - 1);
  }

  private static String askInput(String question, Scanner scanner) {
    System.out.print(question);
    return scanner.nextLine();
  }
}
