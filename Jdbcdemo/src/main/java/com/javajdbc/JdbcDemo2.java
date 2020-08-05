package com.javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JdbcDemo2 {
    public static void main(String[] args) throws Exception
    {
        JdbcDemo2 demo2=new JdbcDemo2();
        demo2.runApp();

    }

    private void runApp() throws Exception{
        Connection connection=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employeedetails";
            String password = "root";
            String user = "root";
            connection= DriverManager.getConnection(url,password,user);
            String sqlquery="select * from employee where salary<10000";
            PreparedStatement statement=connection.prepareStatement(sqlquery);
            statement.executeQuery();
            ResultSet resultSet=statement.getResultSet();
            while(resultSet.next())
            {
                String name=resultSet.getString("name");
                double salary=resultSet.getDouble("salary");
                System.out.println("Name is="+name+" salary is"+salary);
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
