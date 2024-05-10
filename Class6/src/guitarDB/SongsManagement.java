package guitarDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SongsManagement {
  public static void listSounds() throws Exception {
    Connection connect = SqlConnection.connect();
    Statement statement = connect.createStatement();
    ResultSet result = statement.executeQuery("select * from song");
    while (result.next()) {
      System.out.printf(
          "%d-%s-%s%n",
          result.getInt("sound_order"),
          result.getString("sound_type"),
          result.getString("sound_name"));
    }
  }
}
