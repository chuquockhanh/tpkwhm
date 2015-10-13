package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.Colour;
import com.karltech.tpk.core.dto.ColourBean;
import com.karltech.tpk.core.exception.DuplicateException;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

import java.util.List;


public interface ColourService extends GenericService<Colour,Long> {

    void updateItem(ColourBean ColourBean) throws ObjectNotFoundException, DuplicateException;

    void addNew(ColourBean ColourBean) throws DuplicateException;

    Integer deleteItems(String[] checkList);

    Object[] search(ColourBean bean);

    List<Colour> findAllByOrder(String name);
}