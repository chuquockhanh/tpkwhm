package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Module;
import com.karltech.tpk.core.dto.ModuleBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ModuleService extends GenericService<Module,Long> {
    void updateItem(ModuleBean regionBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ModuleBean regionBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ModuleBean bean);

    void saveOrUpdateAll(List<Module> settings) throws ObjectNotFoundException, DuplicateException;

    List<Module> findModule4WithPrefix(String prefix);

    public Module findByFieldName(String fieldName) throws ObjectNotFoundException;
}