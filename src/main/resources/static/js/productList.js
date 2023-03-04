
$(function(){
    goodList();
    HotList();
    }
)

// 产品展示区
    // 数据库数据
        function goodList()
        {
            var _productlist = document.getElementById("favorite_list");
            $.get("json/json1.json",function(data){
                $.each(data.productData,function(_i,object){
                    if(_i>11) return false;
                // item
                var _favoriteItem = document.createElement("div");
                _favoriteItem.className = "favorite_item";
                _productlist.appendChild(_favoriteItem);
                // show-ctn 跳转
                var _showctn = document.createElement("a");
                _showctn.className = "show-ctn";
                _showctn.href="product.html";
                _favoriteItem.appendChild( _showctn);
                
                // product-image
                var _productimage = document.createElement("div");
                _productimage.className = "product-image";
                _showctn.appendChild( _productimage);
                    // img
                    var _img = document.createElement("img");
                    _img.src=object.productImg;
                    _productimage.appendChild( _img);
                // product-price
                var _productprice = document.createElement("div");
                _productprice.className = "product-price";
                _showctn.appendChild( _productprice);

                    var _productpriceBg = document.createElement("div");
                    _productpriceBg.className = "product-price-bg";
                    _productprice.appendChild( _productpriceBg);
                    // shops-price
                    var _shopsprice = document.createElement("div");
                    _shopsprice.className = "shops-price";
                    _productpriceBg.appendChild( _shopsprice);
                    // sp1
                    var _sp1 = document.createElement("span");
                    _sp1.className = "sp1";
                    _sp1.innerHTML = " 元/斤" ;
                    _shopsprice.innerHTML =object.productPrice ;
                    _shopsprice.appendChild( _sp1);

                //title-field
                    var _titlefield =document.createElement("div");
                    _titlefield.className = "title-field";
                    _showctn.appendChild( _titlefield);
                    // title
                    var _title =document.createElement("div");
                    _title.className = "title";
                    _titlefield.appendChild( _title);
                    // span
                    var _sp2 = document.createElement("span");
                    _sp2.innerHTML =object.productName ;
                    _title.appendChild( _sp2);

                // shop-btm
                var _shopbtm = document.createElement("span");
                _shopbtm.className='shop-btm';
                _showctn.appendChild( _shopbtm);
                // l-shop-btm r-shop-btm
                var _lshopbtm =document.createElement("div");
                _lshopbtm.className='l-shop-btm';
                _lshopbtm.innerHTML=object.MercName;
                _shopbtm.appendChild( _lshopbtm);

                var _rshopbtm =document.createElement("div");
                _rshopbtm.className='r-shop-btm';
                _rshopbtm.innerHTML=object.MercAddress;
                _shopbtm.appendChild( _rshopbtm);
            })
        })
    }

        function HotList(){
            
            var _HotList = document.getElementById("rtLiTwoCol");
            $.get("json/json1.json",function(data){
                $.each(data.productData,function(_i,object){
                    if(_i>3) return false;
                // dd
                var _HotItem = document.createElement("dd");
                _HotList.appendChild(_HotItem);

                // a
                var _HotA = document.createElement("a");
                _HotItem.appendChild( _HotA);
                // img
                var _HotImg = document.createElement("img");
                _HotImg.src=object.productImg;
                _HotA.appendChild( _HotImg);
                // p
                var _HotPrice = document.createElement("p");
                _HotPrice.innerHTML = object.productPrice;
                _HotA.appendChild( _HotPrice);
                })
           })
        }
       

       
