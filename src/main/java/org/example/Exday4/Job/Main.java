package org.example.Exday4.Job;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
    String url = "jdbc:sqlite:C:\\Users\\dev\\Desktop\\Java course\\exercises\\day4\\exercise\\hr.db";
    String query = "select * from jobs";

    try (Connection conn = DriverManager.getConnection(url)) {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            jobs j=new jobs(rs);
            System.out.println(j);
        }

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }


    }
}
