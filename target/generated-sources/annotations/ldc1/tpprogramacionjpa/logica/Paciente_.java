package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;
import javax.annotation.processing.Generated;
import ldc1.tpprogramacionjpa.logica.Hospital;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T18:20:21", comments="EclipseLink-3.0.2.v20210716-re8d4b571c9")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, Integer> codigo;
    public static volatile SingularAttribute<Paciente, Integer> id;
    public static volatile SingularAttribute<Paciente, Date> fechaDeInternacion;
    public static volatile SingularAttribute<Paciente, Hospital> hospital;

}