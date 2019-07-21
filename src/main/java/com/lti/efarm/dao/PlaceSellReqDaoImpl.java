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

import com.lti.efarm.model.Farmer;
import com.lti.efarm.model.PlaceSellReq;

@Repository
public class PlaceSellReqDaoImpl implements PlaceSellReqDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	public void saveSellReq(PlaceSellReq theSellReq) {
		Session currentSession=sessionFactory.getCurrentSession();
		System.out.println("In DAo"+theSellReq.getCrop_name());
		currentSession.saveOrUpdate(theSellReq);
	}


	public List<PlaceSellReq> getPlaceSellReq() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<PlaceSellReq> cq=cb.createQuery(PlaceSellReq.class);
		Root<PlaceSellReq> root=cq.from(PlaceSellReq.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	}


	public PlaceSellReq getPlaceSellReq(int theReqId) {
		Session currentSession=sessionFactory.getCurrentSession();
		PlaceSellReq theSellReq=currentSession.get(PlaceSellReq.class, theReqId);
		return theSellReq;
	}

}
