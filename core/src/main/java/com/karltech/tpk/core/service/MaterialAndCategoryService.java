package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.MaterialAndCategory;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;

public interface MaterialAndCategoryService extends GenericService<MaterialAndCategory,Long> {
    Integer deleteItems(String[] checkList);

    void deleteItem(Long materialAndCategoryID) throws ObjectNotFoundException;

    List<MaterialAndCategory> findByMaterialID(Long userID);

}