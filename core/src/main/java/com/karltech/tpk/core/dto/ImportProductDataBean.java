package com.karltech.tpk.core.dto;

import com.karltech.tpk.core.domain.Warehouse;

/**
 * Created with IntelliJ IDEA.
 * User: khanhcq
 * Date: 4/29/14
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImportProductDataBean extends AbstractBean<ImportProductDataDTO> {
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
