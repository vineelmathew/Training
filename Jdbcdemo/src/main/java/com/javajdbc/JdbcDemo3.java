package com.javajdbc;

import java.sql.*;

public class JdbcDemo3 {
    public static void main(String[] args) throws Exception
    {
        JdbcDemo3 demo3=new JdbcDemo3();
        demo3.addDetails(2,"vineel",44,51);

    }

    private void addDetails(int id, String name, int marks,int rollno) throws SQLException {
        Connection connection=null;
        try
        {
            connection=createConnection();
            String sqlquery="insert into details(id,name,marks,rollnumber)values(%d,'%s',%d,%d)";
            String formatsql=String.format(sqlquery,id,name,marks,rollno);
            PreparedStatement statement=connection.prepareStatement(formatsql);
            statement.executeUpdate(formatsql);
            ResultSet resultSet=statement.getResultSet();
            while(resultSet.next())
            {
                int i=resultSet.getInt("id");
                int m=resultSet.getInt("marks");
                int r=resultSet.getInt("rollnumber");
                String na=resultSet.getString("name");
                System.out.println(i+" "+m+" "+r+" "+na);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
    public Connection createConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


    }
