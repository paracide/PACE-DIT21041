package oop;

public class Monitor {
  private int size;
  private String resolution;

  public Monitor(int size, String resolution) {
    this.size = size;
    this.resolution = resolution;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }
}
