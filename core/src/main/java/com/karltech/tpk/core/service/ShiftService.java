package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Shift;
import com.karltech.tpk.core.dto.ShiftBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ShiftService extends GenericService<Shift,Long> {

    void updateItem(ShiftBean ShiftBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ShiftBean ShiftBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ShiftBean bean);
}