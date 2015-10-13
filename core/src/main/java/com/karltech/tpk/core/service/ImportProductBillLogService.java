package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.ImportProductBillLog;
import com.karltech.tpk.core.dto.ImportProductBillLogBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface ImportProductBillLogService extends GenericService<ImportProductBillLog,Long> {

    void updateItem(ImportProductBillLogBean ImportProductBillLogBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ImportProductBillLogBean ImportProductBillLogBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ImportProductBillLogBean bean);
}