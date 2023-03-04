$(function(){
    $('#loginbtn').click(function(){
        if($('#username').val().length<3){
            return alert('用户名不能为空或者用户名不能小于三个字');
        }
        if($('#password').val().length<1){
            return alert('密码不能为空');
        }
    

    let pasame={
        username : $('#username').val(),
        password : $('#password').val()
    }
    // console.log(pasame);
    pasame=JSON.stringify(pasame);

        // ajax请求
        $.ajax({
            url:"",
            type:'POST',
            data:pasame,
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

})
})

