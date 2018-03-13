package com.summary.summary.common.config;

import lombok.Data;

/**
 * Created by dengshengyu on 2017/11/23
 */
public class EmailConfig {

    public static final  String HOST = "${e_common_email_host}";

    public static final  String PORT = "${e_common_email_port}";

    public static final  String FROM = "${e_common_email_from}";

    public static final  String USER = "${e_common_email_user}";

    public static final  String PWD = "${e_common_email_pwd}";

}
