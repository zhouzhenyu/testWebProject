package com.zzy.dao;

import com.zzy.domain.Customer;

import java.util.List;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2020/06/07
 */
public interface LoginMapper {

    /**
     * 查询
     * @return
     */
    List<Customer> query();

}
