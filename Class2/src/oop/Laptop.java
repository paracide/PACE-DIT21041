package oop;

public class Laptop {
  private static int numberOfLaptops;
  private Monitor monitor;
  private Keyboard keyboard;
  private TouchPad touchPad;
  private String brandName;
  private String modelName;
  private double price;
  private int status;

  public Laptop(
      Monitor monitor,
      Keyboard keyboard,
      TouchPad touchPad,
      String brandName,
      String modelName,
      double price) {
    this.monitor = monitor;
    this.keyboard = keyboard;
    this.touchPad = touchPad;
    this.brandName = brandName;
    this.modelName = modelName;
    this.price = price;
  }

  public Laptop(String brandName, String modelName, double price) {
    this.brandName = brandName;
    this.modelName = modelName;
    this.price = price > 0 ? price : 0;
  }

  public static int getNumberOfLaptops() {
    return numberOfLaptops;
  }

  public void installSoftware(Software software) {
    software.runInstallation();
  }

  public void open() {
    this.status = 0;
  }

  public boolean isOpened() {
    return status == 0;
  }

  public void start() {
    this.status = 1;
  }

  public void shutDown() {
    this.status = 2;
  }

  public void hibernate() {
    this.status = 3;
  }

  public void close() {
    this.status = 4;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }

  public Keyboard getKeyboard() {
    return keyboard;
  }

  public void setKeyboard(Keyboard keyboard) {
    this.keyboard = keyboard;
  }

  public TouchPad getTouchPad() {
    return touchPad;
  }

  public void setTouchPad(TouchPad touchPad) {
    this.touchPad = touchPad;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStatus() {
    return status;
  }
}
