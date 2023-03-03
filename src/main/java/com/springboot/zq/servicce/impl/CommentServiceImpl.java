package com.springboot.zq.servicce.impl;

import com.springboot.zq.mapper.CommentMapper;
import com.springboot.zq.pojo.Comment;
import com.springboot.zq.servicce.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    public CommentMapper comment;

    @Override
    public List<Comment> getCommentsByPid(Integer pid) {
        return comment.selectCommentsByPid(pid);
    }
}
