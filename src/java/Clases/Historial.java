
package Clases;

/**
 *
 * @author Jona
 */
public class Historial {
    private int idhistorial;
    private String fechaRegistro;
    private String motivoConsulta;
    private String observacion;
    private String fechaAntCita;
    private String fechaProxCita;
    private Paciente paciente;
    private Medico medico;

    public Historial() {
        paciente = new Paciente();
        medico = new Medico();
    }

    public Historial(int idhistorial, String fechaRegistro, String motivoConsulta, String observacion, String fechaAntCita, String fechaProxCita, Paciente paciente, Medico medico) {
        this.idhistorial = idhistorial;
        this.fechaRegistro = fechaRegistro;
        this.motivoConsulta = motivoConsulta;
        this.observacion = observacion;
        this.fechaAntCita = fechaAntCita;
        this.fechaProxCita = fechaProxCita;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getIdhistorial() {
        return idhistorial;
    }

    public void setIdhistorial(int idhistorial) {
        this.idhistorial = idhistorial;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFechaAntCita() {
        return fechaAntCita;
    }

    public void setFechaAntCita(String fechaAntCita) {
        this.fechaAntCita = fechaAntCita;
    }

    public String getFechaProxCita() {
        return fechaProxCita;
    }

    public void setFechaProxCita(String fechaProxCita) {
        this.fechaProxCita = fechaProxCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
}
