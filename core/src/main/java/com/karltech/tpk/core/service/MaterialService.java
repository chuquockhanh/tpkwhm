package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Material;
import com.karltech.tpk.core.dto.MaterialBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface MaterialService extends GenericService<Material,Long> {

    void updateItem(MaterialBean MaterialBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(MaterialBean MaterialBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] searchByBean(MaterialBean bean);

    List<Material> findByCateCode(String cateCode);

    List<Material> findNoneMeasurement();

    List<Material> findAssigned(Long userID);

}