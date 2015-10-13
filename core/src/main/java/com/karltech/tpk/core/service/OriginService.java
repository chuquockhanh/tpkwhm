package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Origin;
import com.karltech.tpk.core.dto.OriginBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface OriginService extends GenericService<Origin,Long> {

    void updateItem(OriginBean OriginBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(OriginBean OriginBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(OriginBean bean);
}