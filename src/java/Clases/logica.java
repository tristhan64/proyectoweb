
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class logica {
    
    private List<Medico> listaMedico;
    private List<Paciente> listaPaciente;
    private List<Historial> listaHistorial;
    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    public logica() {
        listaHistorial= new ArrayList<>();
        listaMedico = new ArrayList<>();
        listaPaciente = new ArrayList<>();
        
        Paciente paciente= new Paciente(1, "Jona", "Mullo", "Sauces", "095764787");
        listaPaciente.add(paciente);
        Medico medico=new Medico(1, "Karla", "SLopez", "Samanes", "094858855", "user", "1234");
        listaMedico.add(medico);
        listaHistorial.add(new Historial(1, "12-12-12", "Caries", "Cuidado de dientes", "12-12-12", "12-13-12", paciente, medico));
    }

    public List<Historial> getListaHistorial() {
        return listaHistorial;
    }

    public void setListaHistorial(List<Historial> listaHistorial) {
        this.listaHistorial = listaHistorial;
    }
    
    public List<Medico> getListaMedico() {
        return listaMedico;
    }

    public void setListaMedico(List<Medico> listaMedico) {
        this.listaMedico = listaMedico;
    }

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void setListaPaciente(List<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }
    
    // metod de llenado paciente
    public void agregarPaciente(Paciente paciente){
    listaPaciente.add(paciente);
    }    
    // metodo de llenado de medico
    public void agregarMedico(Medico medico){
    listaMedico.add(medico);
    }
    // metodo de llenado historial
    public void agregarHistorial(Historial historial){
        listaHistorial.add(historial);
    }
    
    // login acceso
    public String login(){
        
        /*for (Medico medico : listaMedico) {
            if(medico.getNick().equals(user) && medico.getPassword().equals(pass)){
                return "Menu.xhtml";
            }
        }*/
        return"Menu.xhtml";
    }
    
}
