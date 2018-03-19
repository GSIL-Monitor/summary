/*
package test;

import org.springframework.context.annotation.Bean;

*/
/**
 * Created by dengshengyu on 2018/3/16
 *//*

public class JavaMailSenderImpl {
    @Bean(name = "javaMailSender")
    public JavaMailSenderImpl javaMailSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.qq.com");
        javaMailSender.setPort(465);
        javaMailSender.setUsername("邮箱名@foxmail.com");
        javaMailSender.setPassword("授权码");
        Properties properties = new Properties();
        properties.setProperty("mail.host", "smtp.qq.com");
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");

        javaMailSender.setJavaMailProperties(properties);
        return javaMailSender;
    }


}
*/
