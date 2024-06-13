package ldc1.tpprogramacionjpa;

import java.util.ArrayList;
import java.util.Date;
import ldc1.tpprogramacionjpa.logica.ControladoraLogica;
import ldc1.tpprogramacionjpa.logica.Doctor;
import ldc1.tpprogramacionjpa.logica.Hospital;
import ldc1.tpprogramacionjpa.logica.Paciente;
import ldc1.tpprogramacionjpa.peristencia.ControladoraPersistencia;

public class TPProgramacionJPA {

    public static void main(String[] args) {
        
        // Para el correcto funcionamiento se debe crear una base de datos llamada "pruebajpa"
        
        ControladoraLogica controladoraLogica = new ControladoraLogica();
        ArrayList<Paciente> listaTotalPacientes = new ArrayList<Paciente>();
        ArrayList<Doctor> listaTotalDoctores = new ArrayList<Doctor>();
        
        //    public Paciente(int codigo, Date fechaDeInternacion, int dni, String nombre) {

        
        Paciente p1 = new Paciente(10, new Date(), 25897584, "Juan Perez");
        Paciente p2 = new Paciente(12, new Date(), 25845884, "Jorge Lopez");
        Paciente p3 = new Paciente(14, new Date(), 41548759, "Lucia Romero");
        
        controladoraLogica.crearPaciente(p1);
        controladoraLogica.crearPaciente(p2);
        controladoraLogica.crearPaciente(p3);

        listaTotalPacientes.add(p1);
        listaTotalPacientes.add(p2);
        listaTotalPacientes.add(p3);

        //    public Doctor(int codigo, String especialidad, ArrayList<Paciente> pacientes, int dni, String nombre) {
        Doctor d1 = new Doctor(12, "Clinica", listaTotalPacientes,12546897,"Pedro Gomez");
        controladoraLogica.crearDoctor(d1);
        listaTotalDoctores.add(d1);

        //    public Hospital(int id, String nombre, ArrayList<Doctor> doctores, ArrayList<Paciente> pacientes) {

        Hospital hospital = new Hospital(5, "Hospital General", listaTotalDoctores, listaTotalPacientes);
        
        controladoraLogica.crearHospital(hospital);
        
        System.out.println("--------Pacientes---------");
        ArrayList<Paciente> paciente = controladoraLogica.traerListaPacientes();
        
        for (Paciente p : paciente) {
            System.out.println("Paciente " + p.getNombre());
        }        System.out.println("--------Doctores---------");
        ArrayList<Doctor> doctores = controladoraLogica.traerListaDoctores();
        for (Doctor doctor : doctores) {
            System.out.println("Doctor " + doctor.getNombre()+" Especialidad: "+doctor.getEspecialidad());
        }
        
        
        

//        Alumno alumno = new Alumno(1, "Tomas", "Costa", new Date());
//        
//        controladoraLogica.crearAlumno(alumno);
//        
//        //controladoraLogica.eliminarAlumno(0);
//        
//        alumno.setApellido("Peralta");
//        
//        controladoraLogica.editarAlumno(alumno);
        
    }
}
