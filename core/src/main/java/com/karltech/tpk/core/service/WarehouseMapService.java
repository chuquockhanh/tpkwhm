package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.WarehouseMap;
import com.karltech.tpk.core.dto.WarehouseMapBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface WarehouseMapService extends GenericService<WarehouseMap,Long> {

    void updateItem(WarehouseMapBean districtBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(WarehouseMapBean districtBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(WarehouseMapBean bean);

    List<WarehouseMap> findByWarehouseID(Long warehouseID);
}