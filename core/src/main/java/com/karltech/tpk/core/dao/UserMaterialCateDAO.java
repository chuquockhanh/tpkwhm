package com.karltech.tpk.core.dao;

import com.karltech.tpk.core.domain.UserMaterialCate;

import java.util.List;

public interface UserMaterialCateDAO extends GenericDAO<UserMaterialCate,Long> {

    List<UserMaterialCate> findByUserID(Long userID);
}