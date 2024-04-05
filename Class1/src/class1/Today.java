package class1;

import java.awt.*;
import java.sql.Timestamp;

public class Today {
  private Timestamp now = new Timestamp(System.currentTimeMillis());

  public Timestamp getNow() {
    return now;
  }
}
