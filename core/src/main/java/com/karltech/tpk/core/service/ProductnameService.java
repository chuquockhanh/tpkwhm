package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Productname;
import com.karltech.tpk.core.dto.ProductnameBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ProductnameService extends GenericService<Productname,Long> {

    void updateItem(ProductnameBean ProductnameBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ProductnameBean ProductnameBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ProductnameBean bean);
}