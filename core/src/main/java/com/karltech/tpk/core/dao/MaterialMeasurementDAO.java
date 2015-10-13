package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.MaterialMeasurement;

import java.sql.Timestamp;
import java.util.List;
public interface MaterialMeasurementDAO extends GenericDAO<MaterialMeasurement,Long> {
    List<MaterialMeasurement> findLatestValue(Long warehouseID);

    List<MaterialMeasurement> findUsedInProduction(Long warehouseID, Timestamp minDate, Timestamp maxDate, Integer productionType);
}