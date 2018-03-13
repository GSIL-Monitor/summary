package com.summary.summary.controller;

import com.summary.summary.entity.UserEntity;
import com.summary.summary.service.LoginService;
import com.summary.summary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("login")
//@ResponseBodya
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    //获取properties里面的值测试
//    @Value("${spring.EmailUtildatasource.username}")
//    String name;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = {"/",""})
    public String login(){
        return "login";
    }

    /**
     * 主页
     */
    @RequestMapping(value = {"/index"})
    public String index(){
        return "index";
    }

    /**
     * 找回密码
     * @return
     */
    @RequestMapping(value = {"/forgetPwd"})
    public String forgetPwd(){
        return "forgetPwd";
    }


    /**
     * 发送验证码
     * @param request
     * @return
     */
    @RequestMapping(value = "/validateCode", method = RequestMethod.POST)
    @ResponseBody
    public Map validateCode(HttpServletRequest request){
        Map map = new HashMap<>();

        loginService.validateCode(request);
        return map;
    }


    @RequestMapping("verify")
    @ResponseBody
    public HashMap verify(HttpServletRequest request){
        String userName = request.getParameter ("userName");
        String password = request.getParameter ("password");

        UserEntity userEntity = new UserEntity();
        userEntity.setPassWord ("admin");
        userEntity.setUserName ("admin");
        HashMap hashMap = userService.get(userEntity);
        System.out.println(hashMap);
        return userService.get(userEntity);
    }



    @RequestMapping("registerUser")
    public String registerUser(){
        return "registerUser";
    }


    @RequestMapping("saveUser")
    public HashMap saveUser(HttpServletRequest request ){
        System.out.println ("---saveUser---");
        String userName = request.getParameter ("userName");
        System.out.println (userName);
        return null;
    }
}
