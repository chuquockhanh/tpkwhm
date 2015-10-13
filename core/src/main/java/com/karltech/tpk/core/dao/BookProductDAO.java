package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.BookProduct;

import java.util.List;

public interface BookProductDAO extends GenericDAO<BookProduct,Long> {
	public List<BookProduct> findByBookProductBillID(Long exportProductBillID);
}