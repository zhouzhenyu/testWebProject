package com.zzy.service.impl;

import com.zzy.dao.LoginMapper;
import com.zzy.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description TODO
 * 
 * @author zhouzhenyu
 * @date 2020/5/8 9:53
 **/
@Service
@RequiredArgsConstructor
public class LoginServiceImpl {

    private final LoginMapper mapper;

    public List<Customer> query(String a, String b){
        return mapper.query();
    }

}
