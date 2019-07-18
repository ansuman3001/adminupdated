package com.lti.efarm.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.efarm.model.Bidder;



@Repository
public class BidderDaoImpl implements BidderDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;


	public void saveBidder(Bidder theBidder) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theBidder);

	}

	@Override
	public List<Bidder> getBidder() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Bidder> cq=cb.createQuery(Bidder.class);
		Root<Bidder> root=cq.from(Bidder.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	}


	public Bidder getBidder(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Bidder theBidder=currentSession.get(Bidder.class, theId);
		return theBidder;
	}

}
