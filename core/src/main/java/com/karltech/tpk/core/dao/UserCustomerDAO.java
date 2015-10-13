package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.UserCustomer;

import java.util.List;

public interface UserCustomerDAO extends GenericDAO<UserCustomer,Long> {

    List<UserCustomer> findByUserID(Long userID);
}