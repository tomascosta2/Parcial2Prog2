package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;
import ldc1.tpprogramacionjpa.logica.Doctor;
import ldc1.tpprogramacionjpa.logica.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T18:10:57", comments="EclipseLink-3.0.2.v20210716-re8d4b571c9")
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile ListAttribute<Hospital, Doctor> doctores;
    public static volatile ListAttribute<Hospital, Paciente> pacientes;
    public static volatile SingularAttribute<Hospital, Integer> id;
    public static volatile SingularAttribute<Hospital, String> nombre;

}