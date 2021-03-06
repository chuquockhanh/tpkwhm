package com.karltech.tpk.core.service;

import com.karltech.tpk.core.dao.GenericDAO;
import com.karltech.tpk.core.dao.MachineComponentPictureDAO;
import com.karltech.tpk.core.domain.MachineComponentPicture;
import com.karltech.tpk.core.domain.Machinecomponent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MachineComponentPictureServiceImpl extends GenericServiceImpl<MachineComponentPicture,Long>
                                                    implements MachineComponentPictureService {

    protected final Log logger = LogFactory.getLog(getClass());

    private MachineComponentPictureDAO machineComponentPictureDAO;

    public void setMachineComponentPictureDAO(MachineComponentPictureDAO machineComponentPictureDAO) {
        this.machineComponentPictureDAO = machineComponentPictureDAO;
    }

    @Override
	protected GenericDAO<MachineComponentPicture, Long> getGenericDAO() {
		return machineComponentPictureDAO;
	}


    @Override
    public void saveComponentPicture(Machinecomponent machinecomponent, String path, String des) {
        MachineComponentPicture machinePicture = new MachineComponentPicture();
        machinePicture.setMachinecomponent(machinecomponent);
        machinePicture.setPath(path);
        machinePicture.setDes(des);
        machineComponentPictureDAO.save(machinePicture);

    }
}