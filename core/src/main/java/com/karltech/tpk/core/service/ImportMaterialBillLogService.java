package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.ImportMaterialBillLog;
import com.karltech.tpk.core.dto.ImportMaterialBillLogBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ImportMaterialBillLogService extends GenericService<ImportMaterialBillLog,Long> {

    void updateItem(ImportMaterialBillLogBean ImportMaterialBillLogBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ImportMaterialBillLogBean ImportMaterialBillLogBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ImportMaterialBillLogBean bean);
}