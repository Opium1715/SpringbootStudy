package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    Product selectByPrimaryKey(Integer productId);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);

    @Select("select product_img from product where product_id = #{productId,jdbcType=INTEGER}")
    String selectImgPathByPrimaryKey(Integer productId);
}