
// function searchHelper()// 模糊查询
// {   let keyword = document.querySelector('.keyword');
//     let searchhelper = document.querySelector('.search-helper');//获取下拉列表
//     // 定义数组
//     let searcharr = ['鸡蛋','鸡精','味精','食用盐'];
//     keyword.oninput= function(){
//         searchhelper.innerHTML='';
//         for(let i = 0;i<searcharr.length;i++){
//         if(searcharr[i].indexOf(keyword.value)!= -1){
//             searchhelper.innerHTML +='<p>'+searcharr[i]+'</p>'
//             searchhelper.style.display = 'block';
//             }
//         }
//     }

//     keyword.onblur = function(){
//         searchhelper.style.display = 'none';
//     }
// }


 
$(function(){
    menu();
    // searchHelper();
    }
)

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
