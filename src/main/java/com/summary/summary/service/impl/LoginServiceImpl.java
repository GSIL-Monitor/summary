package com.summary.summary.service.impl;

import com.summary.summary.common.CommonUtil;
import com.summary.summary.common.EmailUtil;
import com.summary.summary.common.config.EmailConfig;
import com.summary.summary.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by dengshengyu on 2017/11/22
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Value(EmailConfig.HOST)
    private String host;

    @Value(EmailConfig.PORT)
    private String port;

    @Value(EmailConfig.FROM)
    private String from;

    @Value(EmailConfig.USER)
    private String user;

    @Value(EmailConfig.PWD)
    private String pwd;

    private EmailUtil emailUtil;

    /**
     *
     */
    @Autowired
    private CommonUtil commonUtil;

    @Override
    public Map validateCode(HttpServletRequest request) {
        //生成6位随机数验证码
        Integer verificationCode = commonUtil.verificationCode();
//        Random random = new Random();
       /* Integer verificationCode = random.nextInt(899999);
        verificationCode = verificationCode + 100000;*/
        request.getSession().setAttribute("verificationCode", verificationCode);
        request.getSession().setAttribute("userName", "测试用户");
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(60);

        HashMap<Object, Object> map = new HashMap<>();
        // 协议
        map.put("host", host);
        // 端口
        map.put("port", port);
        // 发件人邮箱
        map.put("from", from);
        // 连接服务器的邮箱
        map.put("user", user);
        map.put("pwd", pwd);

        try {
            emailUtil.sendEmailNoFile(map, "2686151092@qq.com", "重置密码验证码",
                    "您重置密码验证码是 " + verificationCode
                            + ",此验证码有效时间为5分钟，请及时输入");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
