$(function () {
    // 定义开关变量
    var flagUser=false
    var flagPwd=false
    var flagCpwd=false
    var flagEmail=false
    var flagAllow=true

    // 找到所在标签元素
    var $user_name = $('#username')
    var $pwd=$('#password')
    var $cpwd=$('#passwordCheck')
    var $email=$('#email')
    var $allow=$('#allow')
    var $submit=$('#sbmt_btn')

    // 1.如果失去焦点，则进行检查判断用户名是否合法
    $user_name.blur(function () {
        // 封装函数 调用函数
        fnCheckUser()
    })
    function fnCheckUser() {
        // 获取用户输入的数据
        var vals = $user_name.val()
        // 正则，正则验证用户输入的数据是否合法
        var re = /^\w{6,20}$/

        if (vals == '') {
            $user_name.next().show().html('用户名不能为空')
            flagUser=false
            return
        }
        if (re.test(vals)) {
            // 合法 -- 隐藏报错信息
            $user_name.next().hide()
            flagUser=true
        } else {
            // 不合法 -- 报错 -- 下面的span标签显示
            $user_name.next().show().html('用户名是6-20位数字、字母和下划线！')
            flagUser=false
        }
    }

        // 2.如果密码框失去焦点，则进行检查判断密码是否合法
    $pwd.blur(function(){
        // 封装函数，调用函数
        fnCheckPwd()
    })
    function fnCheckPwd(){
        // 获取密码框输入的数据
        var vals=$pwd.val()
        // 密码正则匹配表达式
        var rePass = /^[\w]{6,20}$/
        // 如果输入框为空，则提示不能为空并return
        if (vals==''){
            $pwd.next().show().html('密码不能为空')
            flagPwd=false
            return
        }
        // 正则验证密码输入是否合法
        if(rePass.test(vals))
        {
            // 如果匹配成功，则隐藏span标签
            $pwd.next().hide()
            flagPwd=true
        }
        else
        {
            // 如果匹配失败，则显示span标签，替换提示信息
            $pwd.next().show().html('密码是6到20位字母或数字');
            flagPwd=false
        }
    }

    // 3.判断两次输入的密码是否一致
    $cpwd.blur(function(){
        // 封装函数，调用函数
        fnCheckCpwd()
    })
    function fnCheckCpwd(){
        // 获取重复密码框输入的数据
        var vals=$pwd.val()
        var cvals=$cpwd.val()
        if(cvals==''){
            $cpwd.next().show().html('确认密码框不能为空')
            flagCpwd=false
            return  
        }
        if (vals==cvals){
            $cpwd.next().hide()
            flagCpwd=true
        }
        else{
            $cpwd.next().show().html('两次密码输入不一致，请重新输入')
            flagCpwd=false
            return
        }
    }

    // // 4.如果邮箱框失去焦点，则进行检查判断邮箱是否合法
    // $email.blur(function(){
    //     // 封装函数，调用函数
    //     fnCheckEmail()
    // })
    // function fnCheckEmail(){
    //     // 获取邮箱框输入的数据
    //     var vals=$email.val()
    //     // 邮箱正则匹配表达式
    //     var reMail = /^[a-z0-9][\w\.\-]*@[a-z0-9\-]+(\.[a-z]{2,5}){1,2}$/i
    //     // 如果输入框为空，则提示不能为空并return
    //     if (vals==''){
    //         $email.next().show().html('邮箱不能为空')
    //         flagEmail=false
    //         return
    //     }
    //     // 正则验证邮箱输入是否合法
    //     if(reMail.test(vals))
    //     {
    //         // 如果匹配成功，则隐藏span标签
    //         $email.next().hide()
    //         flagEmail=true
    //     }
    //     else
    //     {
    //         // 如果匹配失败，则显示span标签，替换提示信息
    //         $email.next().show().html('你输入的邮箱格式不正确')
    //         flagEmail=false
    //     }
    // }
    
    
     // 5.点击同意协议复选框，判断是否勾选。如果勾选，则隐藏提示信息，没有勾选，则显示报错信息
     $allow.click(function(){
         fnCheckAllow()
        })
    // 封装函数
    function fnCheckAllow(){
        if($allow.prop('checked'))
         {
            // $allow.next().hide()
            flagAllow=true
         }
         else
         {
             flagAllow=false
         }
    }

    // 6.所有输入框验证通过再提交注册
    $submit.click(function(){
        if(flagUser && flagPwd && flagCpwd && flagAllow){
            
    let pasame={
        username : $user_name.val(),
        password : $pwd.val()
    }
        console.log(pasame);
        pasame=JSON.stringify(pasame);

        // ajax请求
        $.ajax({
            url:"",
            type:'POST',
            // data:pasame,
            contentType:'json',
            sussess:function(res){
                console.log(res);
                if(res.code===200){
                    alert('登录成功')
                    location.href="./index.html"
                }else{
                    alert(res.msg);
                }
            }
        })

        }
        else if(!flagAllow){
            alert("请勾选同意注册协议！")
            return false
        }
        else{
            alert("请填写注册信息！")
            return false

        }
    })






})

