package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Team;
import com.karltech.tpk.core.dto.TeamBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;


public interface TeamService extends GenericService<Team,Long> {

    void updateItem(TeamBean TeamBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(TeamBean TeamBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(TeamBean bean);
}