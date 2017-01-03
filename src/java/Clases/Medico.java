
package Clases;


/**
 *
 * @author Jona
 */
public class Medico {
    private int idmedico;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String nick;
    private String password;

    public Medico() {
        this.nick="user";
        this.password="1234";
    }

    public Medico(int idmedico, String nombre, String apellido, String direccion, String telefono, String nick, String password) {
        this.idmedico = idmedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nick = nick;
        this.password = password;
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
        
}
