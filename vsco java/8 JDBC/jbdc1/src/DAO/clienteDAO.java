package DAO;

import Entidades.Cliente;

public final class clienteDAO extends DAO{
    public void guardarUsuario(Cliente cliente){
        try{
            if (cliente == null){
                throw new Exception("Ingresar datos del cliente");
            }
            //String sql = "INSERT INTO Cliente ()"
        }catch(Exception e){
            throw e;
        }
    }
}
