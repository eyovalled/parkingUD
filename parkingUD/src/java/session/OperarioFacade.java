/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Operario;

/**
 *
 * @author Estudiantes
 */
@Stateless
public class OperarioFacade extends AbstractFacade<Operario> {

    @PersistenceContext(unitName = "parkingUDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OperarioFacade() {
        super(Operario.class);
    }
    
}
