package com.springboot.zq.servicce;

import com.github.pagehelper.PageInfo;
import com.springboot.zq.pojo.Comment;

import java.util.List;

public interface CommentService {
    PageInfo<Comment> getCommentsByPid(Integer pid, Integer pageNo);



}
