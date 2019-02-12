import java.sql.*;

class JDBC {

    private final static String URL = "jdbc:mysql://localhost:3306/userbank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private final static String USER = "root";
    private final static String PASSWORD = "root";
    private Connection connection;

    JDBC(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    Connection getConnection() {
        return connection;
    }
}
