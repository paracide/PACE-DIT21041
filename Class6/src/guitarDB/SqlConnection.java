package guitarDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

  public static Connection connect() throws ClassNotFoundException, SQLException {
    return DriverManager.getConnection(
        DbConfig.getDbUrl(), DbConfig.getUserName(), DbConfig.getPassword());
  }
}
