package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.MaterialMeasurement;
import com.karltech.tpk.core.dto.MaterialMeasurementBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface MaterialMeasurementService extends GenericService<MaterialMeasurement,Long> {

    void updateItem(MaterialMeasurementBean MaterialMeasurementBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(MaterialMeasurementBean MaterialMeasurementBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    List<MaterialMeasurement> findPreviousMaterialValue(Long warehouseID);

    Object[] search(MaterialMeasurementBean bean);
}