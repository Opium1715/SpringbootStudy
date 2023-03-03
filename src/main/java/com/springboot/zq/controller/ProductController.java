package com.springboot.zq.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.zq.pojo.Comment;
import com.springboot.zq.pojo.Product;
import com.springboot.zq.servicce.CommentService;
import com.springboot.zq.servicce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CommentService commentService;
    @ResponseBody
    @GetMapping("/{pid}")
    public Map<String,Object> displayProduct(@PathVariable("pid") Integer productId){
        Product product = productService.getProduct(productId);
        HashMap<String,Object> map = new HashMap<>();
        map.put("productData", product);
        return map;
    }
    @ResponseBody
    @GetMapping("/comment/{pid}/{pageNo}")
    public Map<String,Object> displayComment(@PathVariable("pid") Integer productId,@PathVariable("pageNo")
    @RequestParam(defaultValue = "1") Integer pageNo){
        List<Comment> comments = commentService.getCommentsByPid(productId);
        HashMap<String,Object> map = new HashMap<>();
        map.put("comments",comments);
        return map;
    }
    @ResponseBody
    @GetMapping("/page/{pageNo}")
    public Map<String,Object> pageProduct(@PathVariable Integer pageNo){
        PageInfo<Product>pageInfo = productService.getProductList(pageNo);
        HashMap<String,Object> map =new HashMap<>();
        map.put("productList",pageInfo);
        return map;
    }



}
