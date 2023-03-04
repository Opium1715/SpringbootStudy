
function searchHelper()// 模糊查询
{   let keyword = document.querySelector('.keyword');
    let searchhelper = document.querySelector('.search-helper');//获取下拉列表
    // 定义数组
    let searcharr = ['鸡蛋','鸡精','味精','食用盐'];
    keyword.oninput= function(){
        searchhelper.innerHTML='';
        for(let i = 0;i<searcharr.length;i++){
        if(searcharr[i].indexOf(keyword.value)!= -1){
            searchhelper.innerHTML +='<p>'+searcharr[i]+'</p>'
            searchhelper.style.display = 'block';
            }
        }
    }

    keyword.onblur = function(){
        searchhelper.style.display = 'none';
    }
}


 
$(function(){
    menu();
    bestShop();
    classLi();
    productShow();
    searchHelper();
    
    }
)
// 产品展示区

    function productShow(){
        
        var _productlist = document.getElementById("productArea");

    // 只显示前十个
        $.get("json/json1.json",function(data){
            $.each(data.productData,function(_i,object){
                if(_i>9) return false;

                var _bigblock = document.createElement("li");
                _bigblock.className = "product_content";
                _productlist.appendChild(_bigblock);
                // 超链接
                var _a = document.createElement("a");
                _a.href="shop.html";
                _bigblock.appendChild(_a);
                // 添加图片
                var _productImg = document.createElement("img");
                _productImg.className = "product_img";
                _productImg.src=object.productImg;
                _a.appendChild(_productImg);
                // 添加价格
                var _productPrice = document.createElement("p");
                var _productPrice2 = document.createElement("span");
                _productPrice2.innerHTML = object.productPrice+'/元斤';
                _a.appendChild(_productPrice);
                _productPrice.appendChild(_productPrice2);

                // 添加名称
                var _productName = document.createElement("h3");
                _productName.innerHTML = object.productName;
                _a.appendChild(_productName);
            
            })
        })
    }
 // 目录    

    function menu(){
        //通过名字找元素
        var _cateContent = document.getElementById("categoryContent");
        
        $.get("json/json1.json",function(data){
            $.each(data.categoryData,function(_i,object){
                // alert(index+":"+object.category_name);
                    //  dt->a dd->a
                    //创建标题区域
                        var _diretory = document.createElement("dt");
                    // 标题区域加入导航条
                        _cateContent.appendChild(_diretory);
            
                    // 创建超链接区域
                        var _titleText = document.createElement("a");
                    // 超链接添加内容
                    _titleText.innerHTML = object.category_name;
                    _titleText.href="product_list.html";
                    // 加入dt
                    _diretory.appendChild(_titleText);
            
                    //创建dd区域
                    var _dirText = document.createElement("dd");
                    //  dd加入导航条
                    _cateContent.appendChild(_dirText);
            
            
                    $.each(data.categoryData_2,function(_j,obj){
                        //判断父亲
                        if(obj.parentId==object.category_ID){
                        // 写入a标签
                        var _contentText =document.createElement("a");
                        _contentText.href="product_list.html";

                        // a写入内容
                        _contentText.innerHTML=obj.category_name;
                        _dirText.appendChild(_contentText);
                        }
                    })
            });
        })
       
    }

// 优秀供应商
   
    function bestShop(){
        // 数据库数据
        var _bestShop = document.getElementById("bestShop");

        // 只显示前八个
        $.get("json/json1.json",function(data){

            $.each(data.shopData,function(_i,object){
                if(_i>7){
                    // console.log(_i);
                   return false;
                }
            var _shopItem = document.createElement("dd");
            _bestShop.appendChild(_shopItem);
            var _a = document.createElement("a");
            _a.href="shop.html";
            _shopItem.appendChild(_a);
            // 添加图片
            var _shopImg = document.createElement("img");
            _shopImg.src=object.shopImg;
            _a.appendChild(_shopImg);

            // 添加名称
            var _shopName = document.createElement("h2");
            _shopName.innerHTML = object.shopName;
            _a.appendChild(_shopName);
                
         
        }
        );
    })
   
}
    

// 一级目录
    function classLi(){

        var _classLi = document.getElementById("classLi");
        $.get("json/json1.json",function(data){
            $.each(data.categoryData,function(_i,object){
            var LiText = document.createElement("a");
            LiText.innerHTML = object.category_name;
            // 相应onclick事件
            //   toProductList(LiText,object.category_ID)
            _classLi.appendChild(LiText);
        })
     })
}
