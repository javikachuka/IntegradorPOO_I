package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.HistoriaClinica;
import modelo.Turno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T10:33:21")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Date> fechaNac;
    public static volatile SingularAttribute<Paciente, String> historialMedico;
    public static volatile SingularAttribute<Paciente, HistoriaClinica> historiaClinica;
    public static volatile SingularAttribute<Paciente, String> apellido;
    public static volatile SingularAttribute<Paciente, Turno> turno;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile SingularAttribute<Paciente, Integer> numTel;
    public static volatile SingularAttribute<Paciente, Integer> dni;

}