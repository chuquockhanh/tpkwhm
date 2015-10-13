package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Overlaytype;
import com.karltech.tpk.core.dto.OverlaytypeBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface OverlaytypeService extends GenericService<Overlaytype,Long> {

    void updateItem(OverlaytypeBean OverlaytypeBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(OverlaytypeBean OverlaytypeBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(OverlaytypeBean bean);
}