/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacitaciondesarrollo;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AULAFISI
 */
public class ConexionBD {

    private String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    private String user = "root";
    private String password = "root";
    Connection c;

    public void conectar() {
        try {
//    Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Segura");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("conexion fallida");

        }
    }

    public void cerrarConexion() {
        try {
            c.close();
            System.out.println("Alamos v:");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
