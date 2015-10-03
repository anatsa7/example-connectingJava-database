package id.ac.uad.tif;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by an on 03/10/15.
 */
public class KoneksiPengarang {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/belajardb";

    static final String USER = "root";
    static final String PASS = "9";

    public static void main(String[] args) {

        Connection conn = null;
        java.sql.Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Connected database successfully...");

            //Insert
            /*System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO pengarang " +
                    "VALUES ('137-000', 'Andi P', 'Bongkelan III Sleman')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO pengarang " +
                    "VALUES ('125-989', 'Dina L', 'Syuhada XI Wonosari')";
            stmt.executeUpdate(sql);*/

            //Update
            /*System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "UPDATE pengarang " +
                    "SET alamat_p = 'Syuhada XI Magelang' WHERE id = '125-989'";
            stmt.executeUpdate(sql);*/

            //Delete
            /*System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "DELETE FROM pengarang " +
                    "WHERE id = '125-989'";
            stmt.executeUpdate(sql);*/

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally{
            //finally block used to close resources
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");

           /* try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Add Class Succes");

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/belajardb", "root", "9");

                System.out.println("Connection is now " + (connection.isClosed() ? "Closed" : "Open"));

                //Insert
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pengarang (id,nama_p,alamat_p) VALUES (?,?,?)");
                /*preparedStatement.setString(1, "128-282");
                preparedStatement.setString(2, "Syariful F");
                preparedStatement.setString(3, "Margaria No. 3 Bantul");
                int affectedRow = preparedStatement.executeUpdate();
                System.out.println("Success Execute Update, Row Affected : " + affectedRow);

                //Update
                String sql = "UPDATE pengarang SET id=?, nama_p=?, alamat_p=? WHERE id=128-282";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, "128-282");
                preparedStatement.setString(2, "Syariful F");
                preparedStatement.setString(3, "Margaria No. 3 Magelang");
                int affectedRow = preparedStatement.executeUpdate();;
                if (affectedRow > 0) {
                    System.out.println("An existing pengarang was updated successfully!");
                }

            } catch (ClassNotFoundException e) {
                System.err.println("Add Failed : " + e.getMessage());

            } catch (SQLException e) {
                System.err.println("Connection Failed : " + e.getMessage() + " " + e.getSQLState());

            } catch (Exception e) {
                System.err.println("Unknown Exception : " + e.getMessage());
            }*/
    }
}
