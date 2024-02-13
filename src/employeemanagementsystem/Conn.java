package employeemanagementsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=employeemanagementsystem;integratedSecurity=true");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
