package com.jia.studentmanagement;

import java.sql.*;
public class Test {
    public static void main(String[] a)
            throws Exception {
        Connection conn = DriverManager.
                getConnection("jdbc:h2:~/test", "root", "root");
        // add application code here
        conn.close();
    }
}