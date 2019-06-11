package com.entitys;

import com.entitys.Estatus;
import com.entitys.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T12:11:10")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> numeroTrabajador;
    public static volatile SingularAttribute<Usuario, String> apellidoPaterno;
    public static volatile SingularAttribute<Usuario, String> numeroUnico;
    public static volatile SingularAttribute<Usuario, String> extension;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> movil2;
    public static volatile SingularAttribute<Usuario, String> movil1;
    public static volatile SingularAttribute<Usuario, String> numeroOficina;
    public static volatile SingularAttribute<Usuario, String> telefonoOficina;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> apellidoMaterno;
    public static volatile SingularAttribute<Usuario, String> telefonoCasa;
    public static volatile SingularAttribute<Usuario, TipoUsuario> idTipoUsuario;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, Boolean> habilitado;
    public static volatile SingularAttribute<Usuario, Estatus> idEstatus;

}