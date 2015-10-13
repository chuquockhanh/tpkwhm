package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Arrangement;
import com.karltech.tpk.core.dto.ArrangementBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ArrangementService extends GenericService<Arrangement,Long> {

    void updateItem(ArrangementBean ArrangementBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ArrangementBean ArrangementBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ArrangementBean bean);
}