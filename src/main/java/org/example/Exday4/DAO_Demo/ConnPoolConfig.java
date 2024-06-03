package org.example.Exday4.DAO_Demo;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

    public class ConnPoolConfig {

        private static String url = "jdbc:sqlite:C:\\Users\\dev\\Desktop\\Java course\\exercises\\day4\\exercise\\hr.db";
        private static HikariConfig config = new HikariConfig();
        private static HikariDataSource ds;

        static {
            config.setJdbcUrl(url);
            ds = new HikariDataSource(config);
        }


        public static Connection getConnection() throws SQLException {
            return ds.getConnection();
        }


    }