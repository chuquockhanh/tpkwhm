package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Importproduct;
import com.karltech.tpk.core.domain.Importproductbill;
import com.karltech.tpk.core.dto.ImportproductbillBean;
import com.karltech.tpk.core.dto.ItemInfoDTO;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ImportproductbillService extends GenericService<Importproductbill,Long> {

    void updateRootMaterialBill(ImportproductbillBean ImportproductbillBean) throws ObjectNotFoundException, DuplicateException;

    void addNewRootMaterialBill(ImportproductbillBean ImportproductbillBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ImportproductbillBean bean);

    void updateReject(String note, Long importProductBillID, Long loginUserId);

    void updateConfirm(ImportproductbillBean bean) throws ObjectNotFoundException;

    void addProductBill(ImportproductbillBean bean) throws DuplicateException;

    void updateProductBill(ImportproductbillBean bean) throws ObjectNotFoundException, DuplicateException;

    String getLatestPNKTON();

    void updateConfirmMoney(ImportproductbillBean bean) throws ObjectNotFoundException;

    Importproductbill findByParentBill(Long importProductBillID);

    String getLatestPTNTON();

    void saveReImportProduct(ImportproductbillBean bean);

    void updateReImportProuduct(ImportproductbillBean bean) throws ObjectNotFoundException;

    Importproduct updateProductInfo(ItemInfoDTO productInfo, Long loginUserId);

    List<Importproductbill> findAllByOrderAndDateLimit(String importDate, Boolean black, Long date);

    List<Importproductbill> findByIds(List<Long> billIDs);

    void updateMergeBills(ImportproductbillBean bean);
}