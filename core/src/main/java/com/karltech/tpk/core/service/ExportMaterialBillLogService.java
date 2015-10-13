package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.ExportMaterialBillLog;
import com.karltech.tpk.core.dto.ExportMaterialBillLogBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ExportMaterialBillLogService extends GenericService<ExportMaterialBillLog,Long> {

    void updateItem(ExportMaterialBillLogBean ExportMaterialBillLogBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ExportMaterialBillLogBean ExportMaterialBillLogBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ExportMaterialBillLogBean bean);
}