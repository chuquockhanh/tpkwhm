package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Stiffness;
import com.karltech.tpk.core.dto.StiffnessBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface StiffnessService extends GenericService<Stiffness,Long> {

    void updateItem(StiffnessBean StiffnessBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(StiffnessBean StiffnessBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(StiffnessBean bean);
}