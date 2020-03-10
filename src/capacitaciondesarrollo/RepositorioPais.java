/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacitaciondesarrollo;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AULAFISI
 */
public class RepositorioPais {
    ConexionBD com = new ConexionBD();
    public List mostrarTodo(){
        List lista = new ArrayList();
    
        try{
            com.conectar();
            PreparedStatement ps = com.c.prepareStatement("SELECT * FROM pais;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("idpais");
                String nombre = rs.getString("nombre");
                String codigoP = rs.getString("codigopostal");
                Pais p = new Pais(id,nombre,codigoP);
                lista.add(p);
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            com.cerrarConexion();
        }
        return lista;
            
}
}
   
