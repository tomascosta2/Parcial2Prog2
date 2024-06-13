/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.Basic;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Hospital implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombre;
    
    @OneToMany (mappedBy="hospital")
    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;

    public Hospital() {
    }

    public Hospital(int id, String nombre, ArrayList<Doctor> doctores, ArrayList<Paciente> pacientes) {
        this.id = id;
        this.nombre = nombre;
        this.doctores = doctores;
        this.pacientes = pacientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Hospital{" + "id=" + id + ", nombre=" + nombre + ", doctores=" + doctores + ", pacientes=" + pacientes + '}';
    }
    
    
    
}
