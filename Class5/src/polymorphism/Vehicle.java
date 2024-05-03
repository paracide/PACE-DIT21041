package polymorphism;

public abstract class Vehicle implements Hookable, Saleable {
  private String brand;
  private int year;
  private String vin;

  public Vehicle(String brand, int year, String vin) {
    this.brand = brand;
    this.year = year;
    this.vin = vin;
  }

  public abstract void drive();

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  @Override
  public String toString() {
    return String.format(
        "[%s] %s/%s/%s", getClass().getSimpleName(), getBrand(), getYear(), getVin());
  }

  @Override
  public boolean equals(Object obj) {
    Vehicle comparor = (Vehicle) obj;
    return brand.equalsIgnoreCase(comparor.getBrand()) && year == comparor.getYear();
  }

  @Override
  public void sale() {
    System.out.println(brand + " is free");
  }
}
