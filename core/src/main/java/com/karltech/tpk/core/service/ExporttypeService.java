package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Exporttype;
import com.karltech.tpk.core.dto.ExporttypeBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ExporttypeService extends GenericService<Exporttype,Long> {

    void updateItem(ExporttypeBean ExporttypeBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ExporttypeBean ExporttypeBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ExporttypeBean bean);

    Exporttype findByCode(String code);

    List<Exporttype> findExcludeCode(String exportTypeBtsc);
}