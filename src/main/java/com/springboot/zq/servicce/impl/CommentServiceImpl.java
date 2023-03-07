package com.springboot.zq.servicce.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<Comment> getCommentsByPid(Integer pid, Integer pageNo) {
        PageHelper.startPage(pageNo,6);
        List<Comment> commentList = comment.selectCommentsByPid(pid);
        return new PageInfo<Comment>(commentList);
    }
}
