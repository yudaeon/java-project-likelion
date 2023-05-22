package com.example.springbootgradle.db;


import java.sql.*;

public class ConnectionChecker {

    public void check() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection
                ("jdbc:mysql://ec2-3-38-111-117.ap-northeast-2.compute.amazonaws.com:3306/mutsa5th-spring-db",
                        "mutsa.student1", "password");


        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SHOW DATABASES");

        while(rs.next()) {
            String line = rs.getString(1);
            System.out.println(line);
        }
    }
    public void add() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://ec2-3-38-111-117.ap-northeast-2.compute.amazonaws.com:3306/mutsa5th-spring-db",
                "mutsa.student1", "password");

        PreparedStatement pstmt = conn.prepareStatement("insert into users(id, name, password) values (?, ?, ?)");

        pstmt.setString(1, "2");
        pstmt.setString(2, "kyeongrok");
        pstmt.setString(3, "1234");
        pstmt.executeUpdate();
    }

    public static void main(String[] args) throws ClassNotFoundException,SQLException{
    ConnectionChecker cc = new ConnectionChecker();
    cc.add();
    }
}
