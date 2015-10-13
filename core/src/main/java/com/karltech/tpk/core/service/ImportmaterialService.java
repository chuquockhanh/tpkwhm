package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Importmaterial;
import com.karltech.tpk.core.dto.ImportMaterialDataDTO;
import com.karltech.tpk.core.dto.ImportmaterialBean;
import com.karltech.tpk.core.dto.SearchMaterialBean;
import com.karltech.tpk.core.dto.SelectedItemDTO;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ImportmaterialService extends GenericService<Importmaterial,Long> {

    void updateItem(ImportmaterialBean ImportmaterialBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ImportmaterialBean ImportmaterialBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);

    List<Importmaterial> findAllSortAsc();

    Object[] search(ImportmaterialBean bean);

    List<Importmaterial> findAvailableMaterialByWarehouse(Long warehouseID);

    Object[] searchMaterialsInStock(SearchMaterialBean bean);

    Object[] importMaterialData2DB(List<ImportMaterialDataDTO> importedDatas, Long loginUserId);

    List<Importmaterial> findWarningMaterial(Long warehouseID);

    void updateMaterialLocation(List<SelectedItemDTO> selectedItems,Long userID);
}