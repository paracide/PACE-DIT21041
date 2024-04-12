package oop;

public class TouchPad {
  private int size;
  private int numberOfButtons;

  public TouchPad() {
    this.size = 4;
    this.numberOfButtons = 0;
  }

  public TouchPad(int size, int numberOfButtons) {
    this.size = size;
    this.numberOfButtons = numberOfButtons;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getNumberOfButtons() {
    return numberOfButtons;
  }

  public void setNumberOfButtons(int numberOfButtons) {
    this.numberOfButtons = numberOfButtons;
  }
}
