package utilities;

import org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        /*
        Connection
        Statement
        ResultSet
        */
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@mydatabase.c0dimagbi5lf.us-east-2.rds.amazonaws.com:1521/ORCL",
                "mydatabase",
                "mydatabase"
        );
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery("Select * from employees");

        resultSet.next();
        String first_name =  resultSet.getString("First_NAME");
        System.out.println(first_name);
        System.out.println(resultSet.getString("Employee_id"));

        resultSet.next();
        System.out.println(resultSet.getString("First_name"));

        resultSet.last();
        System.out.println(resultSet.getString("First_name"));

        resultSet.first();
        System.out.println(resultSet.getString("First_name"));

        System.out.println(resultSet.getString(1));
        System.out.println(resultSet.getRow());
        System.out.println(resultSet.getObject("Employee_id"));

        //*************************** ResultSetMetaData ***********************************

        // resultSetMetaData --> gives us all details about the columns

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        System.out.println(resultSetMetaData.getColumnCount());
        System.out.println(resultSetMetaData.getColumnName(1));
        System.out.println(resultSetMetaData.getColumnName(5));

        List<Map<String, Object>> data = new ArrayList<>(); //-->polymorphism

        // loop through resultset

         resultSet.beforeFirst();

        while(resultSet.next()){
            Map<String, Object> map = new HashMap<String, Object>();

            for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++){
                map.put(resultSetMetaData.getColumnName(i),resultSet.getObject(resultSetMetaData.getColumnName(i)) );

            }
            data.add(map);
        }
        System.out.println(data.get(10).get("FIRST_NAME"));
        System.out.println(data.get(45).get("EMAIL"));

        //print all salaries of employees using data object

        for (int i = 0; i<data.size(); i++){
            System.out.print(data.get(i).get("SALARY"));
        }
        // Get all emails

        for(int i = 0; i <data.size(); i++){
            System.out.println(data.get(i).get("EMAIL"));
        }

        // from data object get all first_name that starts with letter 'A'
       for (int i = 0; i < data.size(); i++){
           if(data.get(i).get("FIRST_NAME").toString().startsWith("A"))
           System.out.println(data.get(i).get("FIRST_NAME"));
       }

    //Using data object get average salary of all employees

    int total =0;
     for(int i = 0;i <data.size(); i++){
         total = total + Integer.parseInt(data.get(i).get("SALARY").toString());
     }
        System.out.println(total/data.size());
}
}