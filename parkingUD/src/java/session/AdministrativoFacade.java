/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Administrativo;

/**
 *
 * @author Estudiantes
 */
@Stateless
public class AdministrativoFacade extends AbstractFacade<Administrativo> {

    @PersistenceContext(unitName = "parkingUDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministrativoFacade() {
        super(Administrativo.class);
    }
    
}
