package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-14T10:56:57")
@StaticMetamodel(HistoriaClinica.class)
public class HistoriaClinica_ { 

    public static volatile SingularAttribute<HistoriaClinica, Date> fecha;
    public static volatile SingularAttribute<HistoriaClinica, Paciente> paciente;
    public static volatile SingularAttribute<HistoriaClinica, String> descEnfer;
    public static volatile SingularAttribute<HistoriaClinica, Integer> idHisCli;
    public static volatile SingularAttribute<HistoriaClinica, String> medicamentos;

}