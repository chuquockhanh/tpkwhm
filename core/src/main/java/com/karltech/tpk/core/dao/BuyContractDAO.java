package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.BuyContract;
import com.karltech.tpk.core.dto.BuyContractDTO;

import java.util.Date;
import java.util.List;


public interface BuyContractDAO extends GenericDAO<BuyContract,Long> {
    List<BuyContractDTO> findBuyContracts(Date fromDate, Date toDate, Long customerID);

    List<BuyContract> findBuyContractList(Date fromDate, Date toDate, Long customerID);
}