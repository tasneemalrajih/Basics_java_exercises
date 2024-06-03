package org.example.Exday4.DAO_Demo;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String query = "select * from jobs ";

        try (Connection conn = ConnPoolConfig.getConnection();) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                //jobs j = new jobs(rs);
               // System.out.println(j);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}