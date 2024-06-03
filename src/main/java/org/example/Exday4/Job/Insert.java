package org.example.Exday4.Job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;


public class Insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\Desktop\\Java course\\exercises\\day4\\exercise\\hr.db";
        String query = "insert into jobs values (?,?,?,?)";

        try(Connection conn = DriverManager.getConnection(url))

        {
            PreparedStatement st = conn.prepareStatement(query);
            System.out.println("Enter job ID: ");
            int jId = sc.nextInt();
            st.setInt(1, jId);
            sc.nextLine();
            System.out.println("Enter job title: ");
            String jti = sc.nextLine();
            st.setString(2, jti);
            sc.nextLine();

            System.out.println("Enter Main salary: ");
            double jmain = sc.nextDouble();
            st.setDouble(3, jmain);

            System.out.println("Enter Max salary: ");
            double jmax = sc.nextDouble();
            st.setDouble(4, jmax);
            int rows= st.executeUpdate();
            System.out.println(rows+" Insert Update");

        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
