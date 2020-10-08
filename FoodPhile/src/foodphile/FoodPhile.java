/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodphile;
import java.sql.*;

/**
 *
 * @author www.luv2code.com
 */
public class FoodPhile {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String root = "root";
        String pass = "YES";

        try {
// 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/one");

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("INSERT INTO `one`.`food_items` (`Id`, `Name`, `Quantity`, `Price`) VALUES ('3', 'Chips2', '3', '30');");

            // 4. Process the result set
            

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }    

}

