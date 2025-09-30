package dk.via.group4.persistance.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtil
{
  private ConnectionUtil instance;
  public static Connection getConnection() throws SQLException
  {

    return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=slaughterhouse",
        "postgres", "password");
  }
  private ConnectionUtil()
  {
    if (instance ==null)
    {
      synchronized (this)
      {
        if (instance == null)
        {
          DriverManager.registerDriver(new org.postgresql.Driver());
        }
      }
    }
    //Create a connection to the DriverManager

  }

}
