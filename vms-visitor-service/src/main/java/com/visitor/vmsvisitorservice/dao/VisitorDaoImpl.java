

package com.visitor.vmsvisitorservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.visitor.vmsvisitorservice.model.Visitor;

@Repository
@Transactional
public class VisitorDaoImpl implements IVisitorDao {

	@PersistenceContext
	private EntityManager entityManger;

	@Override
	public List<Visitor> visitorsList() {
		CriteriaBuilder cb = entityManger.getCriteriaBuilder();
		CriteriaQuery<Visitor> cq = cb.createQuery(Visitor.class);
		Root<Visitor> users = cq.from(Visitor.class);
		CriteriaQuery<Visitor> select = cq.select(users);
		TypedQuery<Visitor> tq = entityManger.createQuery(select);
		List<Visitor> visitors_List = tq.getResultList();
		return visitors_List;

	}

	@Override
	public Visitor findById(long id) {

		CriteriaBuilder cb = entityManger.getCriteriaBuilder();
		CriteriaQuery<Visitor> cq = cb.createQuery(Visitor.class);
		Root<Visitor> user = cq.from(Visitor.class);
		Predicate userIdPredicate = cb.equal(user.get("id"), id);
		cq.where(userIdPredicate);
		TypedQuery<Visitor> query = entityManger.createQuery(cq);
		return query.getSingleResult();

	}

	@Override
	public Visitor findByName(String name) {
		CriteriaBuilder cb = entityManger.getCriteriaBuilder();
		CriteriaQuery<Visitor> cq = cb.createQuery(Visitor.class);
		Root<Visitor> user = cq.from(Visitor.class);
		Predicate userNamePredicate = cb.like(user.get("name"), name);
		cq.where(userNamePredicate);
		TypedQuery<Visitor> query = entityManger.createQuery(cq);
		return query.getSingleResult();

	}

}

