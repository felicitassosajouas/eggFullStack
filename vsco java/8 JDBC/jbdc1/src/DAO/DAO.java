package DAO;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public abstract class DAO {
    protected Connection connection = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    

    private final String USER = "root";
    private final String PASSWORD = "root1234.";
    private final String DATABASE = "root";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    

    protected void conectarBase() throws Exception{
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            connection = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception{
        try{
            if(resultado != null){
                resultado.close();
            }
            if(sentencia != null){
                sentencia.close();
            }
            if(connection != null){
                connection.close();
            }
        } catch(Exception e){
            throw e;
        }
    }

    protected void instarModificarEliminar(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = connection.createStatement();
            sentencia.executeUpdate(sql);
        }catch(SQLException | ClassNotFoundException ex){
        throw ex;
        }finally{
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = connection.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
}
