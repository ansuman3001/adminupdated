
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

import com.lti.efarm.model.Auction;



@Repository
public class AuctionDaoImpl implements AuctionDao {
	

	@Autowired
	private SessionFactory sessionFactory;


	public void saveAuction(Auction theAuction) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theAuction);

	}

	public List<Auction> getAuction() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Auction> cq=cb.createQuery(Auction.class);
		Root<Auction> root=cq.from(Auction.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	}

	public Auction getAuction(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Auction theAuction=currentSession.get(Auction.class, theId);
		return theAuction;
	}

}


