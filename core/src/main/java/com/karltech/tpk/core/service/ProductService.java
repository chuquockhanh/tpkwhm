package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Product;
import com.karltech.tpk.core.dto.ProductBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ProductService extends GenericService<Product,Long> {

    void updateItem(ProductBean ProductBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ProductBean ProductBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ProductBean bean);
}