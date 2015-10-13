package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Thickness;
import com.karltech.tpk.core.dto.ThicknessBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ThicknessService extends GenericService<Thickness,Long> {

    void updateItem(ThicknessBean ThicknessBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ThicknessBean ThicknessBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ThicknessBean bean);

    List<Thickness> findAllByOrder(String order);
}