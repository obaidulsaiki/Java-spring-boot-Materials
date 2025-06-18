import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_management";
        String userName = "root";
        String userPassword = "";
        try {
            Connection connection = DriverManager.getConnection(url, userName, userPassword);
            // By default, when we run an SQL command in Java (like inserting, updating, or deleting data),
            // it gets saved to the database right away.
            // This is because auto-commit is turned on by default.
            // but when we use SetAutoCommit(false) - Don’t save anything automatically — we’ll decide when to save using commit()
            // by controlling manually we will be able to not update database if there is an error in updating value
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            try {
                String updateSql = "Update money Set money = money - 100 where id = 1";
                String updateSql2 = "Update money Set money = money + 200 where id = 1";
                String updateSql3 = "Update money Set money = money + 300 where id = 2";
                String updateSql4 = "Update money Set money = null where id = 3";
                statement.execute(updateSql);
                statement.execute(updateSql2);
                statement.execute(updateSql3);
                statement.execute(updateSql4);
                connection.commit(); // if everything is okay then update the database, if wrong raise exception
            } catch (SQLException e) {
                // when the queries are wrong then exception will be generated and rollback() method will be called
                // rollback function will be make the database into the previous state and the value will not update
                connection.rollback();
                System.out.println("This is inner problem + " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("This is outer problem: " + e.getMessage());
        }
    }
}