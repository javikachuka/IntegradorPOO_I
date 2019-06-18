package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Especialidad;
import modelo.Turno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-17T22:07:27")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, Integer> nrTel;
    public static volatile SingularAttribute<Medico, Integer> hsComienzoM;
    public static volatile SingularAttribute<Medico, String> apellido;
    public static volatile SingularAttribute<Medico, Integer> hsFinalM;
    public static volatile SingularAttribute<Medico, Integer> nrMatricula;
    public static volatile ListAttribute<Medico, Turno> turnos;
    public static volatile SingularAttribute<Medico, Integer> hsComienzoT;
    public static volatile SingularAttribute<Medico, Integer> tiempoTurno;
    public static volatile SingularAttribute<Medico, Integer> hsFinalT;
    public static volatile SingularAttribute<Medico, String> nombre;
    public static volatile SingularAttribute<Medico, Especialidad> especialidad;

}