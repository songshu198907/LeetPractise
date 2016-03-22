package hadoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by songheng on 3/7/16.
 */
public class DBDemo {
    private final static  String CONNECTION = "jdcb:mysql://localhost/root";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(CONNECTION,"root","1989731");
        System.out.println("It works for now ");


    }
}
