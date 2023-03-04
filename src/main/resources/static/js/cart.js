  // 数据库数据
  var productData = { p001 : {   productImg:'upload/goods001.jpg',productPrice:'11.00',productName:'山东腊肠'},
  p002 : {   productImg:'upload/goods002.jpg',productPrice:'21.00',productName:'玉米'},
  p003 : {   productImg:'upload/goods003.jpg',productPrice:'12.00',productName:'红豆'},
  p004 : {   productImg:'upload/goods004.jpg',productPrice:'141.00',productName:'香肠'},
  };

$(function(){
    // 复选
        $(".chkAll").change(function(){
            
    $(".chk, .chkAll").prop("checked", $(this).prop("checked"));
        });

        $(".chk").change(function(){
            if($(".chk:checked").length=== $(".chk").length){
            $(".chkAll").prop("checked", true);
            getSum();                                                                                                                                                                                                                   
            }
            else{
            $(".chkAll").prop("checked", false);   
            } 
        });


    // 增减商品模块
    $(".count_i").click(function(){
        var n=$(this).siblings(".number").val();//获取文本中值
        n++;//点击+号，加一
        $(this).siblings(".number").val(n);//赋值给原来文本框
        
        var p=$(this).parent().siblings(".center_price").children(".rmb_icon").html();
        var price=(p*n).toFixed(2);//保留两位小数
        $(this).parent().siblings(".center").children(".rmb_sum").html(price);//赋值
        getSum();
         })	;
    $(".count_d").click(function(){
        var n=$(this).siblings(".number").val();
        if(n>1)
        n--;
        $(this).siblings(".number").val(n);	
            
        var p=$(this).parent().siblings(".center_price").children(".rmb_icon").html();
        var price=(p*n).toFixed(2);//保留两位小数
        $(this).parent().siblings(".center").children(".rmb_sum").html(price);//赋值
        getSum();
         });
    $(".number").change(function(){//改变文本框同时改变小计
        var n=$(this).val();
        if(n<1){
            $(this).val(1);
            return false;
        }
        var p=$(this).parent().siblings(".center_price").children(".rmb_icon").html();
        $(this).parent().siblings(".center").children(".rmb_sum").html((p*n).toFixed(2));
        getSum();	
    });
    getSum();

    // 总计
    function getSum(){
        var money = 0;
        $(".chk").each(function(index,item){
            if($(item).prop("checked")==true ){
                money+=parseFloat($(this).parent().siblings(".center").children(".rmb_sum").text());
                ;
            }
            $(".price_sum").text(" ￥"+money.toFixed(2));
        })
    }

    $(".chk ").click(function(){
        getSum();
    })

    $(".chkAll").click(function(){
        $(".chk").prop("checked",true);
        getSum();
            
    })

    // 删除
    $(".center_d").click(function(){//删除
		
        var flag = confirm("确定删除该商品吗?");
        if(flag){
            $(this).parents(".cart_Item").remove();
            getSum();
        }
		
	})
	$(".removeBatch").click(function(){//删除选中商品
        var flag = confirm("确定删除选中商品吗?");
        if(flag){
            $(".chk:checked").parents(".cart_Item").remove();
            getSum();
        }
	
	})	
	$(".removeAll").click(function(){//清空购物车
        var flag = confirm("确定清空购物车吗?");
        if(flag){
            $(".cart_Item").remove();	
            getSum();
        }
	
	})


});


  