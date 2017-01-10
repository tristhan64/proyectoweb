/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import repository.repositoryClinica;

/**
 *
 * @author Jona
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private String username;
    private String password;
    private final repositoryClinica loginController;

    public String loginControl() {
        if (loginController.loginClinica(username, password)) {
            return "VistaPaciente.xhtml";
        }
        RequestContext.getCurrentInstance().update("growl");
    FacesContext context = FacesContext.getCurrentInstance();
    context.addMessage(username, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Username or password invalid"));

        
        return "";
    }

    public LoginBean() {
        this.loginController = new repositoryClinica();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
