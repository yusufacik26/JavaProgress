import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        DbHelper help = new DbHelper();
        PreparedStatement stmt = null;

        try {
            conn = help.getConnection();
            String sql = "INSERT INTO city(Name,CountryCode,District,Population) VALUES(?,?,?,?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Düzce 2");
            stmt.setString(2, "TUR");
            stmt.setString(3, "Düzce"); // 3. parametre District için
            stmt.setInt(4, 70000);




            int result = stmt.executeUpdate();

            System.out.println("Kayıt eklendi!!");
            System.out.println("Bağlantı başarılı!!");
        } catch (SQLException e) {
            help.showErrorMessage(e);
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
                help.showErrorMessage(e);
            }

            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                help.showErrorMessage(e);
            }
        }
    }
}
