package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.BuyContract;
import com.karltech.tpk.core.dto.BuyContractBean;
import com.karltech.tpk.core.dto.BuyContractDTO;
import com.karltech.tpk.core.dto.ReportByContractBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface BuyContractService extends GenericService<BuyContract,Long> {

    void updateItem(BuyContractBean buyContractBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(BuyContractBean buyContractBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(BuyContractBean bean);

    List<BuyContractDTO> reportImportByContract(ReportByContractBean bean);
}