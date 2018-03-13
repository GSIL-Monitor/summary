package com.summary.summary.entity;

import com.summary.summary.enums.UserSexEnum;
import lombok.Data;

/**
 * Created by dengshengyu on 2017/7/14.
 */
@Data
public class UserEntity {
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum gender;
}