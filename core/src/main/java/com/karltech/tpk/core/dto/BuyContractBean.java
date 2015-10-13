package com.karltech.tpk.core.dto;

import com.karltech.tpk.core.domain.BuyContract;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Chu Quoc Khanh
 * Date: 18/02/14
 * Time: 22:14
 * To change this template use File | Settings | File Templates.
 */
public class BuyContractBean extends AbstractBean<BuyContract> {
    public BuyContractBean(){
        this.pojo = new BuyContract();
    }

    private Date fromDate;
    private Date toDate;

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
