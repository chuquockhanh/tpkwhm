package com.karltech.tpk.core.dao;

import java.util.List;

import com.karltech.tpk.core.domain.Market;
/**
 * <p>Generic DAO layer for Markets</p>
 * <p>Generated at Tue Feb 18 21:28:56 ICT 2014</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 *
 */
public interface MarketDAO extends GenericDAO<Market,Long> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildMarketDAO()
	 */
	  	 
	/**
	 * Find Market by name
	 */
	public List<Market> findByName(String name);

	/**
	 * Find Market by code
	 */
	public List<Market> findByCode(String code);

	/**
	 * Find Market by description
	 */
	public List<Market> findByDescription(String description);

}