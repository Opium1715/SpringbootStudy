package com.springboot.zq.servicce.impl;

import com.springboot.zq.mapper.ProductMapper;
import com.springboot.zq.pojo.Product;
import com.springboot.zq.servicce.CategoryService;
import com.springboot.zq.servicce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;
    @Override
    public Product getProduct(Integer productId) {
        return productMapper.selectByPrimaryKey(productId);
    }
}
