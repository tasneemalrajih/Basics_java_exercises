package org.example.Exday4.Department;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\dev\\Desktop\\Java course\\exercises\\day4\\exercise\\hr.db";
        String query = "select * from departments";

        try (Connection conn = DriverManager.getConnection(url)) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
               department d=new department(rs);
                System.out.println(d);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}