package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.OweLog;
import com.karltech.tpk.core.dto.OweLogBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;


public interface OweLogService extends GenericService<OweLog,Long> {

    void updateItem(OweLogBean OweLogBean) throws Exception;

    void addNew(OweLogBean OweLogBean) throws DuplicateException;

    Integer deleteItems(String[] checkList) throws ObjectNotFoundException;

    Object[] search(OweLogBean bean);

    Double findCustomerOweUtilDate(Long customerID, Date date);

    Map<Long,Double> findCustomersOweUtilDate(List<Long> customerIDs, Timestamp timestamp);

    List<OweLog> findPrePaidByBill(Long bookProductBillID);

}