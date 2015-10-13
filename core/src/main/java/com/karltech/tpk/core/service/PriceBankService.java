package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.PriceBank;
import com.karltech.tpk.core.dto.PriceBankBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

public interface PriceBankService extends GenericService<PriceBank,Long> {

    void updateItem(PriceBankBean bean) throws ObjectNotFoundException, DuplicateException;

    void addNew(PriceBankBean bean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(PriceBankBean bean);
}