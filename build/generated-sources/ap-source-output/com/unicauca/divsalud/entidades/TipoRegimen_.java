package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.CategoriaAfiliado;
import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-05T21:38:35")
@StaticMetamodel(TipoRegimen.class)
public class TipoRegimen_ { 

    public static volatile CollectionAttribute<TipoRegimen, Paciente> pacienteCollection;
    public static volatile SingularAttribute<TipoRegimen, Integer> id;
    public static volatile CollectionAttribute<TipoRegimen, CategoriaAfiliado> categoriaAfiliadoCollection;
    public static volatile SingularAttribute<TipoRegimen, String> nombre;

}