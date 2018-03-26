package com.summary.summary.common;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by dengshengyu on 2018/3/16
 */
@Service
public class CommonUtil {

    /**
     * 生成6位随机数
     */
    public Integer verificationCode(){
        Random random = new Random();
        Integer verificationCode = random.nextInt(899999);
        verificationCode = verificationCode + 100000;
        return verificationCode;
    }



}
