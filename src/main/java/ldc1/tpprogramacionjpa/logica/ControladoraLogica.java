package ldc1.tpprogramacionjpa.logica;

import java.util.ArrayList;
import ldc1.tpprogramacionjpa.peristencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    // CRUD Alumno
//    public void crearAlumno(Alumno alumno) {
//        controladoraPersistencia.crearAlumno(alumno);
//    }
//    public void eliminarAlumno(int id) {
//        controladoraPersistencia.eliminarAlumno(id);
//    }
//    public void editarAlumno(Alumno alumno) {
//        controladoraPersistencia.editarAlumno(alumno);
//    }
    
    
    // TODO: CRUD Hospital
    public void crearHospital(Hospital hos){
        controladoraPersistencia.crearHospital(hos); // crear método en controladoraPersistencia
    }
    
    public void eliminarHospital(int id){
        controladoraPersistencia.eliminarHospital(id);
    }
    
    public void editarHospital(Hospital hos){
        controladoraPersistencia.editarHospital(hos);
    }
    
    public Hospital traerHospital(int id){
        return controladoraPersistencia.traerHospital(id);
    }

    //crud paciente
    
    public void crearPaciente(Paciente pac){ 
        controladoraPersistencia.crearPaciente(pac);
        
    }
    
    public void eliminarPaciente(int id){
        controladoraPersistencia.eliminarPaciente(id);
    }
    
    public Paciente traerPaciente(int id){
        return controladoraPersistencia.traerPaciente(id);
    }
    
    public void editarPaciente(Paciente pac){
        controladoraPersistencia.editarPaciente(pac);
    }
    
    
    public ArrayList<Paciente> traerListaPacientes(){
        return controladoraPersistencia.traerListaPacientes();
    }
    
}
