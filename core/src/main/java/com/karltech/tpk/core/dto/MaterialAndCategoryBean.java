package com.karltech.tpk.core.dto;

import com.karltech.tpk.core.domain.MaterialAndCategory;

/**
 * Created with IntelliJ IDEA.
 * User: Chu Quoc Khanh
 * Date: 18/02/14
 * Time: 22:14
 * To change this template use File | Settings | File Templates.
 */
public class MaterialAndCategoryBean extends AbstractBean<MaterialAndCategory> {
    public MaterialAndCategoryBean(){
        this.pojo = new MaterialAndCategory();
    }
}
