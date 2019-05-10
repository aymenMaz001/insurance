package tn.esprit.insurance.service.implementation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.insurance.entity.Premium;

/**
 * Session Bean implementation class PremiumService
 */
@Stateless
@LocalBean
public class PremiumService {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public Premium findPrimeById(Long id){
		Premium p = em.find(Premium.class, id);
		return p;
		
	}
	
    public PremiumService() {
        // TODO Auto-generated constructor stub
    }

}
