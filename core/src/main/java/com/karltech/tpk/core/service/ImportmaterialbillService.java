package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Importmaterialbill;
import com.karltech.tpk.core.dto.ImportmaterialbillBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ImportmaterialbillService extends GenericService<Importmaterialbill,Long> {

    void updateItem(ImportmaterialbillBean ImportmaterialbillBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ImportmaterialbillBean ImportmaterialbillBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ImportmaterialbillBean bean);

    void updateReject(String note, Long billID, Long userID);

    void updateConfirm(ImportmaterialbillBean bean) throws ObjectNotFoundException;

    String getLatestPNKPL();

    void updateConfirmMoney(ImportmaterialbillBean bean) throws ObjectNotFoundException;

    List<Importmaterialbill> findAllByOrderAndDateLimit(String importDate, Long date);
}