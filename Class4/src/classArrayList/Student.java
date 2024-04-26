package classArrayList;

public class Student {
  private final String name;
  private final String lastName;
  private final boolean laptopType;
  public Student(String name, String lastName, String laptopType) {
    this.name = name;
    this.lastName = lastName;
    this.laptopType = "mac".equalsIgnoreCase(laptopType);
  }

  public String getFullName() {
    return name + " " + lastName;
  }

  public String getLaptopType() {
    return laptopType ? "Mac" : "Windows";
  }
}
