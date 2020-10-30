/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projecttt;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

import java.sql.Connection;

/**
 *
 * @author GEMIO
 */
public class Connect {

    public static Connection conn() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "root");
            
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cannot");
        }
        return null;

    }
;

    

    
}
