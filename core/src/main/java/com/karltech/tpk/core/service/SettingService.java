package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Setting;
import com.karltech.tpk.core.dto.SettingBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface SettingService extends GenericService<Setting,Long> {
    void updateItem(SettingBean regionBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(SettingBean regionBean) throws ObjectNotFoundException, DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(SettingBean bean);

    void saveOrUpdateAll(List<Setting> settings) throws ObjectNotFoundException, DuplicateException;

    List<Setting> findSetting4WithPrefix(String prefix);

    public Setting findByFieldName(String fieldName) throws ObjectNotFoundException;
}