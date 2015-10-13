package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.BookBillSaleReason;

import java.util.List;

public interface BookBillSaleReasonDAO extends GenericDAO<BookBillSaleReason,Long> {

    List<BookBillSaleReason> findByBookBillID(Long bookBillID);
}