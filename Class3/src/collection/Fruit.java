package collection;

public class Fruit implements Comparable<Fruit> {
  private String name;
  private int quantity;
  private double price;

  public Fruit(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Fruit{" + "name='" + name + '\'' + ", quantity=" + quantity + ", price=" + price + '}';
  }

  @Override
  public int compareTo(Fruit otherFruit) {
    return price == otherFruit.price ? 0 : price < otherFruit.price ? -1 : 1;
  }
}
