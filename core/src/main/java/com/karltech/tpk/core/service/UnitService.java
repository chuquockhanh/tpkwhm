package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Unit;
import com.karltech.tpk.core.dto.UnitBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface UnitService extends GenericService<Unit,Long> {
	void updateItem(UnitBean unitBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(UnitBean unitBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(UnitBean bean);
}