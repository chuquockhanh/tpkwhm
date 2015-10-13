package com.karltech.tpk.core.dao;

import java.util.List;

import com.karltech.tpk.core.domain.Productname;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Productnames</p>
 * <p>Generated at Tue Feb 18 21:28:56 ICT 2014</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 *
 */
public class ProductnameHibernateDAO extends
		AbstractHibernateDAO<Productname, Long> implements
		ProductnameDAO {

	/**
	 * Find Productname by name
	 */
	public List<Productname> findByName(String name) {
		return findByCriteria(Restrictions.eq("name", name));
	}
	
	/**
	 * Find Productname by code
	 */
	public List<Productname> findByCode(String code) {
		return findByCriteria(Restrictions.eq("code", code));
	}
	
	/**
	 * Find Productname by description
	 */
	public List<Productname> findByDescription(String description) {
		return findByCriteria(Restrictions.eq("description", description));
	}
	

}
