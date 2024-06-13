package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Paciente extends Persona implements Serializable {
    /*
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)*/
    private int id;
    @Basic
    private int codigo;
    private Date fechaDeInternacion;

    @ManyToOne
    private Hospital hospital;
    
    public Paciente() {
    }

    public Paciente(int codigo, Date fechaDeInternacion, int dni, String nombre) {
        super(dni, nombre);
        this.codigo = codigo;
        this.fechaDeInternacion = fechaDeInternacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaDeInternacion() {
        return fechaDeInternacion;
    }

    public void setFechaDeInternacion(Date fechaDeInternacion) {
        this.fechaDeInternacion = fechaDeInternacion;
    }
    
    
    
    
}
