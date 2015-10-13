package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Materialcategory;
import com.karltech.tpk.core.dto.MaterialcategoryBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface MaterialcategoryService extends GenericService<Materialcategory,Long> {

    void updateItem(MaterialcategoryBean MaterialcategoryBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(MaterialcategoryBean MaterialcategoryBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(MaterialcategoryBean bean);

    List<Materialcategory> findAssignedCate(Long loginUserId);
}