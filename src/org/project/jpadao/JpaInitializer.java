package org.project.jpadao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.project.dao.Initializer;


public class JpaInitializer extends Initializer {
    
    @Override
    public void  eraseData() {
        EntityManager em = JPAUtil.getCurrentEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        Query query = em.createNativeQuery("delete from \"reservations\"");
        query.executeUpdate();
        
        query = em.createNativeQuery("delete from \"offers\"");
        query.executeUpdate(); 
        
        query = em.createNativeQuery("delete from \"rooms\"");
        query.executeUpdate(); 
        
        query = em.createNativeQuery("delete from \"customers\"");
        query.executeUpdate();
        
        tx.commit();
        em.close();
    }
}
