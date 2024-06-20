
package doan.Dao;

import doan.UI.frmGiaoDienChinh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KetNoiSQL {
    protected Connection con=null;
    Statement statement = null;
    ResultSet resultset;
    public KetNoiSQL()
    {
            String strServer = "LAPTOP-FJCFKP1C";
            String strDatabase = "QuanLyNhaSach";
            String strUser = "sa";
            String strPassword = "123";
            try {
                String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(driver);
                String connectionURL = "jdbc:sqlserver://" + strServer
                        + ":1433;databaseName=" + strDatabase
                        + ";user=" + strUser + ";password=" + strPassword
                        + ";encrypt=false";
                con = DriverManager.getConnection(connectionURL);
                statement = con.createStatement();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
            }    
    }

}
