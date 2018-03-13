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
                <h2>登录名</h2>
                <label>
                    <input type="text" name="userName" id="username" class="txt_input txt_input2" placeholder="用户名">
                </label>
                <h2>密码</h2>
                <label>
                    <input type="password" name="password" id="userpwd" class="txt_input" placeholder="请输入密码">
                </label>


                <p class="forgot"><a id="forgetPwd" href="javascript:void(0);">忘记密码?</a></p>
                <div class="rem_sub">
                    <div class="rem_sub_l">
                        <input type="checkbox" name="checkbox" id="save_me">
                        <label for="checkbox">记住密码</label>
                    </div>
                    <label>
                        <input class="sub_button" type="submit" id="loginBut" value="登录" style="opacity: 0.7;">
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

        $("#loginBut").click(function () {
//            alert(31);
            console.log("test")
            //var loginForm = $("#loginForm").serialize();
            console.log(loginForm)
            $.ajax({
                //data:loginForm,
                url:"${basePath}/login/verify",
                success:function(data){
                    console.log(data);
                    if(data.msg == "success"){
                        location.href="${basePath}/login/index";
                    <#--location.href="${basePath}/index";-->
                        /*console.log(999)
                        setTimeout(function () {
                            alert("登录成功，正在跳转！");
                        },2000)*/
                    }else{
                        alert("用户名或密码错误");
                    }
                }
            })
        })

        $("#forgetPwd").click(function () {
            layer.msg("正在为您跳转...")
//            setTimeout(function () {
                window.location.href="${basePath}/login/forgetPwd";
//            },2000)
        })

    })


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