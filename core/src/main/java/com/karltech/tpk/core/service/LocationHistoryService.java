package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.LocationHistory;
import com.karltech.tpk.core.dto.LocationHistoryBean;


public interface LocationHistoryService extends GenericService<LocationHistory,Long> {
    Object[] search(LocationHistoryBean bean);
}