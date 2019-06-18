package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-17T22:07:27")
@StaticMetamodel(Especialidad.class)
public class Especialidad_ { 

    public static volatile SingularAttribute<Especialidad, String> descripcion;
    public static volatile SetAttribute<Especialidad, Medico> medicos;
    public static volatile SingularAttribute<Especialidad, Integer> idEspecialidad;
    public static volatile SingularAttribute<Especialidad, String> nombre;

}