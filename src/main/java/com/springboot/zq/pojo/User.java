package com.springboot.zq.pojo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Component

//@ConfigurationProperties(prefix = "name")可以按照前缀.属性注入数值
@ConfigurationProperties(prefix = "user1")
public class User {
    private Integer no;
    private  String name;

    private String PassWord;

    public User(Integer no, String passWord) {
        this.no = no;
        PassWord = passWord;
    }


}
