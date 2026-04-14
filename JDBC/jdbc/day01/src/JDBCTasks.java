import java.sql.*;

public class JDBCTasks {
    private static final String URL = "jdbc:mysql://localhost:3306/dbtest11";
    private static final String USER = "root";
    private static final String PASSWORD = "jh@Jh061211";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected successfully!");
            createTable(conn);
            insertData(conn);
            updateNanjingAge(conn);
            updateYangzhouToSuzhou(conn);
            queryLiEmployees(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS staff (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(50) NOT NULL, " +
                "city VARCHAR(50), " +
                "age INT, " +
                "address VARCHAR(100)" +
                ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        }
    }

    private static void insertData(Connection conn) throws SQLException {
        String[] names = {"李白", "杜甫", "李商隐", "白居易"};
        String[] cities = {"扬州", "南京", "北京", "南京"};
        int[] ages = {25, 23, 28, 26};
        String[] addresses = {"扬州市工业园区", "南京市秦淮区", "北京市海淀区", "南京市玄武区"};

        try (Statement stmt = conn.createStatement()) {
            for (int i = 0; i < names.length; i++) {
                String sql = "INSERT INTO staff (name, city, age, address) VALUES ('" +
                        names[i] + "', '" + cities[i] + "', " + ages[i] + ", '" + addresses[i] + "')";
                stmt.executeUpdate(sql);
            }
        }
    }

    private static void updateNanjingAge(Connection conn) throws SQLException {
        String sql = "UPDATE staff SET age = age + 1 WHERE city = '南京'";
        try (Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
        }
    }

    private static void updateYangzhouToSuzhou(Connection conn) throws SQLException {
        String sql = "UPDATE staff SET city = '苏州', address = '苏州工业园区' WHERE city = '扬州'";
        try (Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
        }
    }

    private static void queryLiEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM staff WHERE name LIKE '李%' ORDER BY age DESC";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\nTask 5: Li surname employees (sorted by age DESC):");
            System.out.println("| id | name | city   | age | address         |");
            while (rs.next()) {
                System.out.printf("| %-2d | %-4s | %-6s | %-3d | %-15s |%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("city"),
                        rs.getInt("age"),
                        rs.getString("address"));
            }
        }
    }
}