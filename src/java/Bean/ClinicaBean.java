
package Bean;


import Entidades.Doctor;
import Entidades.Historialclinico;
import Entidades.Paciente;
import Entidades.Usuario;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import repository.repositoryClinica;


/**
 *
 * @author Jona
 */
@ManagedBean
//@ViewScoped
@SessionScoped

public class ClinicaBean implements Serializable {

    // package de entidades y el repositorio
    private Doctor doctor;
    private Paciente paciente;
    private Usuario usuario;
    private Historialclinico historialclinico;
    
    private repositoryClinica clinicaLogica;
// login 
    public void login(){
        //clinicaLogica.login(doctor);
    }
    public ClinicaBean() {
        doctor=new Doctor();
        paciente=new Paciente();
        usuario=new Usuario();
        historialclinico=new Historialclinico();
        clinicaLogica=new repositoryClinica();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Historialclinico getHistorialclinico() {
        return historialclinico;
    }

    public void setHistorialclinico(Historialclinico historialclinico) {
        this.historialclinico = historialclinico;
    }

    public repositoryClinica getClinicaLogica() {
        return clinicaLogica;
    }

    public void setClinicaLogica(repositoryClinica clinicaLogica) {
        this.clinicaLogica = clinicaLogica;
    }
    
    
        
}
