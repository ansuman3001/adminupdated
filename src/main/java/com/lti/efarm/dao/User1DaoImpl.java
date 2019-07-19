package com.lti.efarm.dao;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.lti.efarm.model.User1;

@Repository
public class User1DaoImpl implements User1Dao {
	
	@Autowired
	SessionFactory sessionFactory;


	public User1 checkUser1(User1 theUser1) {
		
		User1 usr1=null;
		Session session=null;
		try {
			session=sessionFactory.getCurrentSession();
			CriteriaBuilder cb=session.getCriteriaBuilder();
			CriteriaQuery<User1> cq=cb.createQuery(User1.class);
			
			Root<User1> root = cq.from(User1.class);
			
			//cq.select(root.get("id"));
			cq.select(root).where(cb.and(
					cb.equal(root.get("bemail_id"), theUser1.getBemail_id()),
					cb.equal(root.get("bpassword"),theUser1.getBpassword())
				));
			
			Query query = session.createQuery(cq);
			query.setMaxResults(1);
			usr1=(User1) query.getSingleResult();			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				//session.close();
			}

		}
		
		return usr1;
	}
	}


