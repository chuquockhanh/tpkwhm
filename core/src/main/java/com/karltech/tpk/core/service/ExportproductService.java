package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Exportproduct;
import com.karltech.tpk.core.domain.Importproduct;
import com.karltech.tpk.core.dto.ExportproductBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.Date;
import java.util.List;


public interface ExportproductService extends GenericService<Exportproduct,Long> {

    void updateItem(ExportproductBean exportproductBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ExportproductBean exportproductBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);
    
    List<Exportproduct> findAllSortAsc();

    Object[] search(ExportproductBean bean);

    List<Importproduct> findProductByProductionPlan(Long productionPlanID);

    List<Importproduct> findExportByPlan(Long productionPlanID);

    Double findTotalExportBlackProduct4ProductionByDate(Date fromDate, Date toDate);

    Boolean updateBringProductBack(Long productid, Long exportid);

//    List<Exportproduct> findAvailableBlackProductByWarehouse(Long warehouseID);
//
//    List<Exportproduct> findTempSelectedBlackProductByWarehouseAndCodes(Long warehouseID, List<String> tempSelectedCodes);
//
//    Object[] searchProductsInStock(SearchProductBean bean);
}