package com.parameta.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-01T09:01:55")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> apellidos;
    public static volatile SingularAttribute<Empleado, String> tipoDocumento;
    public static volatile SingularAttribute<Empleado, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleado, Double> salario;
    public static volatile SingularAttribute<Empleado, Date> fechVinculacionCompania;
    public static volatile SingularAttribute<Empleado, Integer> id;
    public static volatile SingularAttribute<Empleado, String> numeroDocumento;
    public static volatile SingularAttribute<Empleado, String> cargo;
    public static volatile SingularAttribute<Empleado, String> nombres;

}