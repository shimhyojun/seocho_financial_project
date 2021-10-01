package com.hansung.financial.project.utils;

import java.sql.*;

public class DbConnDemo {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://skuser35-mydb.cw2or7iuke4y.us-west-1.rds.amazonaws.com/User";
        String user = "root";
        String passwd = "test1357";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, passwd);

            System.out.println(conn);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from members");
            while (rs.next()) {
                System.out.println(rs.getString("id") + "/" + rs.getString("NAME"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
