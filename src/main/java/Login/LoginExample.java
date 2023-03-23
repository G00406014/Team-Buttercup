
package Login;

        import java.sql.*;
        import javax.sql.DataSource;
        import com.mysql.cj.jdbc.MysqlDataSource;

public class LoginExample {
    //MySql login Page.
    private static final String URL = "jdbc:mysql://localhost:3306/exampledatabase";
    private static final String USERNAME = "Alex";
    private static final String PASSWORD = "Password";
    private static final DataSource dataSource;


    static {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(URL);
        mysqlDataSource.setUser(USERNAME);
        mysqlDataSource.setPassword(PASSWORD);
        dataSource = mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}