package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.SaleReason;

import java.util.List;

public interface SaleReasonDAO extends GenericDAO<SaleReason,Long> {

    List<SaleReason> findAllByOrder();
}