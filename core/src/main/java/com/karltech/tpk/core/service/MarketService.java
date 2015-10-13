package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Market;
import com.karltech.tpk.core.dto.MarketBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface MarketService extends GenericService<Market,Long> {

    void updateItem(MarketBean MarketBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(MarketBean MarketBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(MarketBean bean);
}