package com.prueba.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO <T> {
    //estas lineas hacen la conexión a la persistencia y la base de datos
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory ("prueba");
    protected EntityManager em = EMF.createEntityManager();
    
    // em es la variable para realizar conexion con bd

    public void conectarBaseDatos(){
        try {
            if (!em.isOpen()) {
                //si está cerrado em se creala la conexión
                em = EMF.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void desconectarBaseDatos(){
        try {
            if (em.isOpen()) {
                //si está abierto em se desconecta
                em.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarBaseDatos(T object){
        try {
            conectarBaseDatos();

            //comienza a realizar transacciones con bd:
            em.getTransaction().begin();

            //para guardar objetos nuevos (como un insert)
            em.persist(object);

            //punto final de la transacción
            em.getTransaction().commit();

            //desconecto
            desconectarBaseDatos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


//como el UPDATE sql
    public void editarBaseDatos(T object){
        
        try {
            conectarBaseDatos();

            //comienza a realizar transacciones con bd:
            em.getTransaction().begin();

            //para editar objetos (como un insert)
            em.merge(object);

            //punto final de la transacción
            em.getTransaction().commit();

            //desconecto
            desconectarBaseDatos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void eliminarBaseDatos(T object){
        try {
            conectarBaseDatos();

            //comienza a realizar transacciones con bd:
            em.getTransaction().begin();

            //para eliminar objetos (como un insert)
            em.remove(object);

            //punto final de la transacción
            em.getTransaction().commit();

            //desconecto
            desconectarBaseDatos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
