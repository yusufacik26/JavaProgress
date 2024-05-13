import java.sql.*;

public class DbHelper {
    private final static String userName = "root";
    private final static String password = "0902528528fF*";
    private final static String dbUrl1 ="jdbc:mysql://localhost:3306/world?allowPublicKeyRetrieval=true";


    public Connection getConnection() throws SQLException {
      return DriverManager.getConnection(dbUrl1, userName, password);
    }

    public  void  showErrorMessage(SQLException exception){
        System.out.println("Error"+exception.getMessage());


    }


}
