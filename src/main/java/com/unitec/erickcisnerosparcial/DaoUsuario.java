/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.erickcisnerosparcial;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class DaoUsuario {
     static SessionFactory factory;
     Session session;
     Transaction tranza;
    
    
   public  void abrirSesion() {
       factory=  HibernateUtilidades.getSessionFactory();
       session= factory.openSession();
       tranza=session.beginTransaction();
    }
    
    public  void cerrarTodo(){
        tranza.commit();
        session.close();
    }
    
    public DAOUsuario(){
        
    }
    
    //Creamos el insert
    public void guardar(Usuario u)throws Exception{
        //Aqui poner el codigo de tu guardado
        // despues invocas el metodo cerrarTodo
        abrirSesion();
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Usuario u)throws Exception{
        abrirSesion();
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Usuario> buscarTodos()throws Exception{
        abrirSesion();
    List<Usuario> usuarios=    session.createCriteria(Usuario.class).list();
        return usuarios;
    }
    
    //Creamos el buscarPorId
    public Usuario buscarPorId(Integer id)throws Exception{
        
        return null;
    }
    
    //Creamos el de autenticar 
    public boolean autenticar(Usuario u)throws Exception{
    
    return false;
    }
}
