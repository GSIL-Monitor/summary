<#assign basePath=request.contextPath>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link href="${basePath}/static/Wopop_files/style_log.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="${basePath}/static/Wopop_files/style.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/static/Wopop_files/userpanel.css">
    <script type="text/javascript" src="${basePath}/static/jquery.min.js"></script>
    <script type="text/javascript" src = "${basePath}/static/layer/layer.js"></script>
</head>

<body class="login" mycollectionplug="bind">
<div class="login_m">
    <form id="loginForm" action="javascript:void(0);">
        <div class="login_logo"><label style="font-size: 20px;">登录</label></div>
        <div class="login_boder">
            <div class="login_padding" id="login_model">
                <h2>注册邮箱</h2>
                <label>
                    <input type="text" name="userName" id="username" class="txt_input txt_input2" placeholder="请输入注册邮箱...">
                </label>
                <h2>密码</h2>
                <label>
                    <input class="txt_input" style="float: left;width: 200px;" placeholder="请输入验证码...">
                    <button style="height: 36px; margin-left: 20px;border-radius:5px;" id="send">发送验证码</button>
                    <#--<input class=" h5-grayInput h5-login-password h5-login-password1" type="text" id="verificationCode"/>-->
                </label>

                <div class="rem_sub">
                    <label style="text-align: center">
                        <input class="sub_button" style="margin-top:30px;float: none;margin-left: 80px;" type="submit" id="loginBut" value="重置密码" style="opacity: 0.7;">
                    </label>
                </div>
            </div>
        </div>
    </form>
</div>
<script type="text/javascript">
    $(document).keydown(function(e){
        var ev = document.all ? window.event : e;
        if (ev.keyCode == 13) {
            $("#loginBut").click();
            return false; //阻止回车之后的页面刷新而使得搜索的事件读不到
        }
    })

    $(function () {
        $("#send").click(function(){
            console.log("test")
            $.ajax({
                data:{"aa":"aa"},
                url:"${basePath}/login/validateCode",
                type:"post",
                success:function(data){

                }
            })

        })


    })

    //背景
    window.onload = function () {
        var config = {
            vx: 4,
            vy: 4,
            height: 2,
            width: 2,
            count: 100,
            color: "121, 162, 185",
            stroke: "100, 200, 180",
            dist: 6000,
            e_dist: 20000,
            max_conn: 10
        }
        CanvasParticle(config);
    }
</script>
<script type="text/javascript" src="${basePath}/static/login/canvas-particle.js"></script>
</body>
</html>