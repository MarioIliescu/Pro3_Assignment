package dk.via.group4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtil
{
  private static boolean initialized;
  public static Connection getConnection() throws SQLException
  {
    if(!initialized)
    {
      DriverManager.registerDriver(new org.postgresql.Driver());
      initialized=true;
    }
    //Create a connection to the DriverManager
    return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=slaughterhouse",
        "postgres", "password");
  }
}
