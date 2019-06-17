package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-14T10:56:57")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Boolean> asistencia;
    public static volatile SingularAttribute<Turno, String> recordatorio;
    public static volatile SingularAttribute<Turno, Paciente> paciente;
    public static volatile SingularAttribute<Turno, Medico> medico;
    public static volatile SingularAttribute<Turno, Integer> horarioTurno;
    public static volatile SingularAttribute<Turno, Integer> idTurno;
    public static volatile SingularAttribute<Turno, Date> fechaTurno;

}