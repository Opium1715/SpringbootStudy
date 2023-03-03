package com.springboot.zq.controller;

import com.springboot.zq.pojo.Product;
import com.springboot.zq.servicce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/{pid}")
    public Map<String,Object> displayProduct(@PathVariable("pid") Integer productId){
        Product product = productService.getProduct(productId);
        HashMap<String,Object> map = new HashMap<>();
        map.put("productData", product);
        return map;
    }
}
