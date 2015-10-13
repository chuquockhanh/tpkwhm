package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.UserModule;

import java.util.List;

public interface UserModuleDAO extends GenericDAO<UserModule,Long> {

    List<UserModule> findByUserID(Long userID);
}