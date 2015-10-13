package com.karltech.tpk.core.service;

import com.karltech.tpk.core.dao.ExportMaterialBillLogDAO;
import com.karltech.tpk.core.dao.GenericDAO;
import com.karltech.tpk.core.domain.ExportMaterialBillLog;
import com.karltech.tpk.core.dto.ExportMaterialBillLogBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class ExportMaterialBillLogServiceImpl extends GenericServiceImpl<ExportMaterialBillLog,Long>
                                                    implements ExportMaterialBillLogService {

    protected final Log logger = LogFactory.getLog(getClass());

    private ExportMaterialBillLogDAO ExportMaterialBillLogDAO;

    public void setExportMaterialBillLogDAO(ExportMaterialBillLogDAO ExportMaterialBillLogDAO) {
        this.ExportMaterialBillLogDAO = ExportMaterialBillLogDAO;
    }

    @Override
	protected GenericDAO<ExportMaterialBillLog, Long> getGenericDAO() {
		return ExportMaterialBillLogDAO;
	}

    @Override
    public void updateItem(ExportMaterialBillLogBean colourBean) throws ObjectNotFoundException, DuplicateException {
        ExportMaterialBillLog dbItem = this.ExportMaterialBillLogDAO.findByIdNoAutoCommit(colourBean.getPojo().getExportMaterialBillLogID());
        if (dbItem == null) throw new ObjectNotFoundException("Not found ExportMaterialBillLog " + colourBean.getPojo().getExportMaterialBillLogID());

        ExportMaterialBillLog pojo = colourBean.getPojo();

        this.ExportMaterialBillLogDAO.detach(dbItem);
        this.ExportMaterialBillLogDAO.update(pojo);
    }

    @Override
    public void addNew(ExportMaterialBillLogBean colourBean) throws DuplicateException {
        ExportMaterialBillLog pojo = colourBean.getPojo();
        pojo = this.ExportMaterialBillLogDAO.save(pojo);
        colourBean.setPojo(pojo);
    }

    @Override
    public Integer deleteItems(String[] checkList) {
        Integer res = 0;
        if (checkList != null && checkList.length > 0) {
            res = checkList.length;
            for (String id : checkList) {
                ExportMaterialBillLogDAO.delete(Long.parseLong(id));
            }
        }
        return res;
    }

    @Override
    public Object[] search(ExportMaterialBillLogBean bean) {
        Map<String, Object> properties = new HashMap<String, Object>();
        return this.ExportMaterialBillLogDAO.searchByProperties(properties, bean.getFirstItem(), bean.getMaxPageItems(), bean.getSortExpression(), bean.getSortDirection(), true);
    }
}