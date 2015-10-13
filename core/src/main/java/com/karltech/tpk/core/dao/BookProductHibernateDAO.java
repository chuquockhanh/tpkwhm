package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.BookProduct;
import org.hibernate.criterion.Restrictions;

import java.util.List;
public class BookProductHibernateDAO extends
		AbstractHibernateDAO<BookProduct, Long> implements
		BookProductDAO {

	@SuppressWarnings("unchecked")
	public List<BookProduct> findByBookProductBillID(Long bookProductBillID) {
		return findByCriteria(Restrictions.eq("bookProductBill.bookProductBillID", bookProductBillID));
	}
}
