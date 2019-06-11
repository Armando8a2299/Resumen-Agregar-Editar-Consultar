package com.entitys;

import com.entitys.ClienteEstructura;
import com.entitys.Estatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T12:11:10")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, Date> fechaRegistro;
    public static volatile ListAttribute<Cliente, ClienteEstructura> clienteEstructuraList;
    public static volatile SingularAttribute<Cliente, Integer> numeroCliente;
    public static volatile SingularAttribute<Cliente, String> nombreComercial;
    public static volatile SingularAttribute<Cliente, Estatus> idEstatus;

}