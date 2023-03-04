
// 实现注册
 var ipt = document.getElementById("sbmt_btn")
 var usernameInput = document.getElementById("username");
 var passwordInput = document.getElementById("password");
 var userphoneInput = document.getElementById("userphone");
 var passwordCheckInput = document.getElementById("passwordCheck");

 ipt.onclick = function(){
    var username = usernameInput.value;
    var password = passwordInput.value;
    var passwordCheck = passwordCheckInput.value;
    var userphone = userphoneInput.value;

    // 发送ajax到登录接口
 }