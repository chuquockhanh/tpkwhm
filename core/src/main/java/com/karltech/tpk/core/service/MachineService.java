package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Machine;
import com.karltech.tpk.core.dto.MachineBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface MachineService extends GenericService<Machine,Long> {

    void updateItem(MachineBean MachineBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(MachineBean MachineBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(MachineBean bean);

    List<Machine> findAllActiveMachineByWarehouse(Long warehouseID);

    List<Machine> findWarningMachine(Long warehouseID);

    void updateSubmitMachineForConfirm(Long loginUserId, Long machineID, Integer status);
}