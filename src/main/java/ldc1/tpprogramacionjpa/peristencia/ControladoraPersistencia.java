/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc1.tpprogramacionjpa.peristencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ldc1.tpprogramacionjpa.logica.Doctor;
import ldc1.tpprogramacionjpa.logica.Hospital;
import ldc1.tpprogramacionjpa.logica.Paciente;
import ldc1.tpprogramacionjpa.peristencia.exceptions.NonexistentEntityException;

/**
 *
 * @author tomas
 */
public class ControladoraPersistencia {
    
    HospitalJpaController hosJpa = new HospitalJpaController();
    PacienteJpaController pacJpa = new PacienteJpaController();
    DoctorJpaController docJpa = new DoctorJpaController();

    public void crearHospital(Hospital hos) {

        hosJpa.create(hos);
    }
    
    public void eliminarHospital(int id){
        try {
            hosJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarHospital(Hospital hos) {

        try {
            hosJpa.edit(hos);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Hospital traerHospital(int id) {
         
        return hosJpa.findHospital(id);
        
    }

    // Hospital

    public void crearPaciente(Paciente pac) {
        try {
            pacJpa.create(pac);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarPaciente(int id) {
        try {
            pacJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paciente traerPaciente(int id) {
        return pacJpa.findPaciente(id);
    }

    public void editarPaciente(Paciente pac) {
        try {
            pacJpa.edit(pac);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Paciente> traerListaPacientes() {
        List<Paciente> listaPacientes = pacJpa.findPacienteEntities();
        ArrayList<Paciente> listaTotalPacientes = new ArrayList<Paciente>(listaPacientes);
        return listaTotalPacientes;
    }

    
    //doctor
    
    public void crearDoctor(Doctor doc) {

        try {
            docJpa.create(doc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarDoctor(int id) {
        try {
            docJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Doctor traerDoctor(int id) {
        return docJpa.findDoctor(id);
    }

    public void editarDoctor(Doctor doc) {

        try {
            docJpa.edit(doc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Doctor> traerListaDoctores() {
        List<Doctor> listaDoctores = docJpa.findDoctorEntities();
        ArrayList<Doctor> listaTotalDoctores = new ArrayList<Doctor>(listaDoctores);
        return listaTotalDoctores;
        
    }

   

    
}
