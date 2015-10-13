package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Machine;
import com.karltech.tpk.core.domain.MachinePicture;


public interface MachinePictureService extends GenericService<MachinePicture,Long> {

    void saveMachinePicture(Machine machine, String path, String des);
}