package creational.singleton.example.DatabaseConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Singleton implementation
 * 
 * The Singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
 * 
 * The Connection class is a singleton class. The DriverManager class is a singleton class.
 * 
 * @author hxa.dev
 */
public class Connection {
    private static DriverManager driverManager;

    private Connection(){}

    public static DriverManager getConnection() throws SQLException {
        if(driverManager == null){
            driverManager = (DriverManager) DriverManager.getConnection("jdbc:mysql://localhost:xxx", "usr", "passwd");
        }
        return driverManager;
    }

}
