package com.springboot.zq.servicce;

import com.springboot.zq.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByPid(Integer pid);



}
