package com.summary.summary.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by dengshengyu on 2017/11/22
 */
@Service
public interface LoginService {

     Map validateCode(HttpServletRequest request);
}
