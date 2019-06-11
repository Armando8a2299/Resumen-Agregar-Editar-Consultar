package com.entitys;

import com.entitys.Cliente;
import com.entitys.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T12:11:10")
@StaticMetamodel(Estatus.class)
public class Estatus_ { 

    public static volatile ListAttribute<Estatus, Cliente> clienteList;
    public static volatile SingularAttribute<Estatus, String> clave;
    public static volatile SingularAttribute<Estatus, String> tipo;
    public static volatile ListAttribute<Estatus, Usuario> usuarioList;
    public static volatile SingularAttribute<Estatus, String> nombre;
    public static volatile SingularAttribute<Estatus, Integer> idEstatus;

}