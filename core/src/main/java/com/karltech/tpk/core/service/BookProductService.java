package com.karltech.tpk.core.service;

import com.karltech.tpk.core.domain.BookProduct;
import com.karltech.tpk.core.exception.ObjectNotFoundException;

public interface BookProductService extends GenericService<BookProduct,Long> {
    Integer deleteItems(String[] checkList);

    void deleteItem(Long bookProductID) throws ObjectNotFoundException;
}