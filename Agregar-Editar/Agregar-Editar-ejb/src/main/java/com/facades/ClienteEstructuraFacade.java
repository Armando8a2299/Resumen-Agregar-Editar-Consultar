/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facades;

import com.entitys.ClienteEstructura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless
public class ClienteEstructuraFacade extends AbstractFacade<ClienteEstructura> {

    @PersistenceContext(unitName = "com.mycompany_Agregar-Editar-web_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteEstructuraFacade() {
        super(ClienteEstructura.class);
    }
    
}
