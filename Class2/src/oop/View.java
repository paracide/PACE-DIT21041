package oop;

public class View {
  public static void main(String[] args) {
    Monitor monitor = new Monitor(14, "1440p");
    Keyboard keyboard = new Keyboard("en");
    TouchPad touchPad = new TouchPad(5, 0);

    Laptop laptop = new Laptop("Apple", "Macbook Air", 1400);
    laptop.setMonitor(monitor);
    laptop.setKeyboard(keyboard);
    laptop.setTouchPad(touchPad);

    laptop.open();
    if (laptop.isOpened()) {
      Software intellij = new Software("Intellij", 300, "en");
      laptop.installSoftware(intellij);
    }
  }
}
