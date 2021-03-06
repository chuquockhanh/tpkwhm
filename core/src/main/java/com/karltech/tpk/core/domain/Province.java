package com.karltech.tpk.core.domain;

import java.io.Serializable;


/**
 * <p>Pojo mapping TABLE province</p>
 * <p></p>
 *
 * <p>Generated at Tue Feb 18 21:28:56 ICT 2014</p>
 * @author Salto-db Generator v1.0.16 / Hibernate pojos and xml mapping files.
 * 
 */
public class Province implements Serializable {

	/**
	 * Attribute provinceID.
	 */
	private Long provinceID;
	
	/**
	 * Attribute name.
	 */
	private String name;
	
	/**
	 * Attribute region
	 */
	 private Region region;	

	
	/**
	 * <p> 
	 * </p>
	 * @return provinceID
	 */
	public Long getProvinceID() {
		return provinceID;
	}

	/**
	 * @param provinceID new value for provinceID 
	 */
	public void setProvinceID(Long provinceID) {
		this.provinceID = provinceID;
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
	
	/**
	 * get region
	 */
	public Region getRegion() {
		return this.region;
	}
	
	/**
	 * set region
	 */
	public void setRegion(Region region) {
		this.region = region;
	}


}