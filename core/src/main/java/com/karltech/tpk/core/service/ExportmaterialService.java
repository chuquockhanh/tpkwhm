package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Exportmaterial;
import com.karltech.tpk.core.dto.*;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ExportmaterialService extends GenericService<Exportmaterial,Long> {

    void updateItem(ExportmaterialBean exportmaterialBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ExportmaterialBean exportmaterialBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ExportmaterialBean bean);

    SummaryUsedMaterialDTO reportUsedMaterial(SearchUsedMaterialBean bean);

    Object[] reportProductionCost(SearchProductionCostBean bean);

    List<Exportmaterial> findExportByPlan(Long productionPlanID);
}