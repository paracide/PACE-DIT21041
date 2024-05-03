public class Vehicle {
  private String brand;
  private int year;
  private String vin;

  public Vehicle(String brand, int year, String vin) {
    this.brand = brand;
    this.year = year;
    this.vin = vin;
  }

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
}
