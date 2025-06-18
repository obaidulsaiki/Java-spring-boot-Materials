import java.sql.*; // important to use sql based program

public class Main {
    public static void main(String[] args) {
        // To connect Java to the Xampp database we have to fast download :
        // Download SQL connector from: https://dbschema.com/jdbc-driver/mysql.html?srsltid=AfmBOoqKMLOy857t4QpVwAfX6Tv4ShbyLJtBXouEA5BctsVEPXbzIZ2K
        // Now open intellij idea and open a project, now go to the top right side of the setting
        // Click project structure > libraries > click + > connect the sql connector

        // to connect the database we need to have 3 information the link,username and user password
        // url = jdbc:mysql://localhost:3306/database_name
        String url = "jdbc:mysql://localhost:3306/student_management";
        String userName = "root";
        String userPassword = "";
        try {
            Connection connection = DriverManager.getConnection(url,userName,userPassword);
            Statement statement = connection.createStatement();
            // query to fetch all the data from the students table
            String sqlQueries = "Select * from students;";
            ResultSet resultSet = statement.executeQuery(sqlQueries);
            while(resultSet.next()){
                System.out.println( resultSet.getString("name")+ "|" + resultSet.getString("address") + "|" + resultSet.getString("gmail") );
            }
            // To insert information to the database:
            String insertQueries = "insert into students(name,address,gmail) values ('lsd','chandpur','lsd@gmail.com')";
            statement.executeUpdate(insertQueries);

            //Update information into the  queries :
            String updateQuery = "UPDATE students SET name = 'RifatSalma' WHERE ID = 3;";
            statement.execute(updateQuery);

            // delete information query
            String deleteQuery ="DELETE FROM students WHERE ID = 4;";
            statement.execute(deleteQuery);

        } catch (SQLException e) {
            System.out.println("Problem: " +e.getMessage());
        }

    }
}