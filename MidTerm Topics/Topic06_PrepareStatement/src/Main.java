import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_management";
        String userName = "root";
        String userPassword = "";
        try {
            Connection connection = DriverManager.getConnection(url,userName,userPassword);
            // insert query with prepare statement;
            String sqlQuery = "insert into students(name,address,gmail) values (?,?,?); ";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,"Saiket");
            preparedStatement.setString(2,"uttara sector 1");
            preparedStatement.setString(3,"saikatGain@gmail.com");
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }

    }
}