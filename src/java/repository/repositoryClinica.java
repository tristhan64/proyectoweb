/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import Entidades.Doctor;
import java.util.List;
import javax.faces.application.FacesMessage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Jona
 */
public class repositoryClinica {
    // login 
    public String login(Doctor doctor){
       
        
       Session n= Util.NewHibernateUtil.getSessionFactory().getCurrentSession();
        n.beginTransaction();
        Query query= n.createQuery("select nick, pass from Doctor where nick=? and pass=?")
                .setString(0, doctor.getNick())
                .setString(1, doctor.getPass());
        List<Doctor> list = (List<Doctor>) query.list();
        
        if(list.size()>0){
            System.out.println("ver "+doctor.getNick());
            System.out.println("ver "+doctor.getPass());
            n.close();
            
            return "Menu.xhtml";
        }else{
         return "Menu.xhtml";
        }
    }
    //lista historialClini sl paciente
    
    
}
