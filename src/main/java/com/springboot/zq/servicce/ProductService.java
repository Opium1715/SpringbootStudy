package com.springboot.zq.servicce;

import com.springboot.zq.pojo.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
    Product getProduct(Integer productId);
}
