package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.ExportProductBillLog;
import com.karltech.tpk.core.dto.ExportProductBillLogBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ExportProductBillLogService extends GenericService<ExportProductBillLog,Long> {

    void updateItem(ExportProductBillLogBean ExportProductBillLogBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ExportProductBillLogBean ExportProductBillLogBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ExportProductBillLogBean bean);
}