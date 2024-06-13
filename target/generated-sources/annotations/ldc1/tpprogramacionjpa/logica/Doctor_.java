package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;
import ldc1.tpprogramacionjpa.logica.Hospital;
import ldc1.tpprogramacionjpa.logica.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T18:20:21", comments="EclipseLink-3.0.2.v20210716-re8d4b571c9")
@StaticMetamodel(Doctor.class)
public class Doctor_ extends Persona_ {

    public static volatile SingularAttribute<Doctor, Integer> codigo;
    public static volatile ListAttribute<Doctor, Paciente> pacientes;
    public static volatile SingularAttribute<Doctor, Integer> id;
    public static volatile SingularAttribute<Doctor, Hospital> hospital;
    public static volatile SingularAttribute<Doctor, String> especialidad;

}