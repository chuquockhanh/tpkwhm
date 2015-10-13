package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Region;
import com.karltech.tpk.core.dto.RegionBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface RegionService extends GenericService<Region,Long> {

    void updateItem(RegionBean regionBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(RegionBean regionBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);
    
    List<Region> findAllSortAsc();

    Object[] search(RegionBean bean);
}