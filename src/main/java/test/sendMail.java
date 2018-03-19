/*
package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

*/
/**
 * Created by dengshengyu on 2018/3/16
 *//*

public class sendMail {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    public void sendMail(String code) {
        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mailMessage, true, "utf-8");
            helper.setFrom("邮箱名@foxmail.com");// 设置发件人
            helper.setTo("收件人@163.com");// 设置收件人
//            helper.setCc(cc);// 设置抄送
            helper.setSubject("验证码");// 设置主题
            helper.setText("验证码:【"+code+"】");// 邮件体
            javaMailSender.send(mailMessage);// 发送邮件
            log.info("邮件发送成功...");
        } catch (Exception e) {
            log.error("邮件发送发生异常:" + e.getMessage(), e);
            try {
                Thread.sleep(1000 * 1000);
                this.sendMail(code);
            } catch (InterruptedException e1) {
                log.error("重发邮件发生异常:" + e1.getMessage(), e1);
            }
        }
    }
}
*/
