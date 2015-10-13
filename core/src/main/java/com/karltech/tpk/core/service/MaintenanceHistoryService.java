package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Maintenancehistory;
import com.karltech.tpk.core.dto.MaintenancehistoryBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface MaintenanceHistoryService extends GenericService<Maintenancehistory,Long> {
    void updateItem(MaintenancehistoryBean bean) throws ObjectNotFoundException, DuplicateException;

    void addNew(MaintenancehistoryBean bean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(MaintenancehistoryBean bean);


    Maintenancehistory findLastestMachine(Long machineID);
    Maintenancehistory findLastestMachineComponent(Long machineComponentID);


    List<Maintenancehistory> findByMachine(Long machineID);

    List<Maintenancehistory> findByMachineComponent(Long machineComponentID);

}