package com.zzy.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2020/06/07
 */
@Mapper
public interface LoginMapper {

    /**
     * 查询
     * @return
     */
    String query();

}
