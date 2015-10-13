package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.MachineComponentPicture;
import com.karltech.tpk.core.domain.Machinecomponent;


public interface MachineComponentPictureService extends GenericService<MachineComponentPicture,Long> {

    void saveComponentPicture(Machinecomponent machinecomponent, String path, String des);
}