package com.karltech.tpk.webapp.dto;

import java.io.Serializable;

public class CellValue implements Serializable {
    private CellDataType type;
    private Object value;

    public CellValue() {

    }
    public CellValue(CellDataType type, Object value) {
        this.type = type;
        this.value = value;
    }
    public CellDataType getType() {
        return type;
    }

    public void setType(CellDataType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
