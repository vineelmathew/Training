package com.javajdbc;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


public class JavaDatabaseDemo {
    public static void main(String args[]) throws  Exception
    {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employeedetails";
            String password = "root";
            String user = "root";
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String query = "select * from employee";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Double salary=resultSet.getDouble("salary");
                System.out.println("Name is=" + name+" Salary is "+salary);
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }

    }
}
