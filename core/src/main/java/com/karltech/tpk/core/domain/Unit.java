package com.karltech.tpk.core.domain;

import java.io.Serializable;


/**
 * <p>Pojo mapping TABLE unit</p>
 * <p></p>
 *
 * <p>Generated at Tue Feb 18 21:28:56 ICT 2014</p>
 * @author Salto-db Generator v1.0.16 / Hibernate pojos and xml mapping files.
 * 
 */
public class Unit implements Serializable {

	/**
	 * Attribute unitID.
	 */
	private Long unitID;
	
	/**
	 * Attribute name.
	 */
	private String name;
	

	/**
	 * <p> 
	 * </p>
	 * @return unitID
	 */
	public Long getUnitID() {
		return unitID;
	}

	/**
	 * @param unitID new value for unitID 
	 */
	public void setUnitID(Long unitID) {
		this.unitID = unitID;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name new value for name 
	 */
	public void setName(String name) {
		this.name = name;
	}

}