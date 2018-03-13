package com.summary.summary.service;

import com.summary.summary.entity.UserEntity;
import com.summary.summary.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/19.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public HashMap get(UserEntity user){
        HashMap map = new HashMap<> ();
        Integer verify = userMapper.verify (user);
        if (verify > 0){
            map.put ("msg","success");
        }else{
            map.put ("msg","error");
        }
        return map;
    }



}
