
$(function(){
    shopList();
    }
)

        function shopList(){
            
            var _ShopList = document.getElementById("rtLiTwoCol");
            $.get("json/json1.json",function(data){
                $.each(data.productData,function(_i,object){
                    if(_i>3) return false;
                // dd
                var _HotItem = document.createElement("dd");
                _HotList.appendChild(_HotItem);

                // a
                var _HotA = document.createElement("a");
                toProductList(_HotA,object.productId);
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
       

       
