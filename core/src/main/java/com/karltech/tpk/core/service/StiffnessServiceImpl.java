package com.karltech.tpk.core.service;

import com.karltech.tpk.core.dao.StiffnessDAO;
import com.karltech.tpk.core.dao.GenericDAO;
import com.karltech.tpk.core.domain.Stiffness;
import com.karltech.tpk.core.dto.StiffnessBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class StiffnessServiceImpl extends GenericServiceImpl<Stiffness,Long>
                                                    implements StiffnessService {

    protected final Log logger = LogFactory.getLog(getClass());

    private StiffnessDAO StiffnessDAO;

    public void setStiffnessDAO(StiffnessDAO StiffnessDAO) {
        this.StiffnessDAO = StiffnessDAO;
    }

    @Override
	protected GenericDAO<Stiffness, Long> getGenericDAO() {
		return StiffnessDAO;
	}

    @Override
    public void updateItem(StiffnessBean bean) throws ObjectNotFoundException, DuplicateException {
        Stiffness dbItem = this.StiffnessDAO.findByIdNoAutoCommit(bean.getPojo().getStiffnessID());
        if (dbItem == null) throw new ObjectNotFoundException("Not found Stiffness " + bean.getPojo().getStiffnessID());

        Stiffness pojo = bean.getPojo();

        this.StiffnessDAO.detach(dbItem);
        this.StiffnessDAO.update(pojo);
    }

    @Override
    public void addNew(StiffnessBean bean) throws DuplicateException {
        Stiffness pojo = bean.getPojo();
        pojo = this.StiffnessDAO.save(pojo);
        bean.setPojo(pojo);
    }

    @Override
    public Integer deleteItems(String[] checkList) {
        Integer res = 0;
        if (checkList != null && checkList.length > 0) {
            res = checkList.length;
            for (String id : checkList) {
                StiffnessDAO.delete(Long.parseLong(id));
            }
        }
        return res;
    }

    @Override
    public Object[] search(StiffnessBean bean) {
        Map<String, Object> properties = new HashMap<String, Object>();

        if (StringUtils.isNotBlank(bean.getPojo().getName())) {
            properties.put("name", bean.getPojo().getName());
        }

        return this.StiffnessDAO.searchByProperties(properties, bean.getFirstItem(), bean.getMaxPageItems(), bean.getSortExpression(), bean.getSortDirection(), true);
    }
}