package guitarDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbConfig {
  private static Properties properties = new Properties();
  private static String configFile =
      "/Users/yodon/IdeaProjects/DIT21041/Class6/resource/mysql.yaml";

  static {
    try {
      FileInputStream is = new FileInputStream(configFile);
      properties.load(is);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static String getDbUrl() {
    return properties.getProperty("url");
  }

  public static String getUserName() {
    return properties.getProperty("user");
  }

  public static String getPassword() {
    return properties.getProperty("password");
  }
}
