package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.SaleReason;
import com.karltech.tpk.core.dto.SaleReasonBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface SaleReasonService extends GenericService<SaleReason,Long> {

    void updateItem(SaleReasonBean SaleReasonBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(SaleReasonBean SaleReasonBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(SaleReasonBean bean);

    List<SaleReason> findAllByOrder();
}