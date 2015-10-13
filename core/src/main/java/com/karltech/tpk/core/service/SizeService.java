package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Size;
import com.karltech.tpk.core.dto.SizeBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface SizeService extends GenericService<Size,Long> {

    void updateItem(SizeBean SizeBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(SizeBean SizeBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(SizeBean bean);

    List<Size> findAllByOrder(String order);

}