package com.lin.pet.service.impl;


import com.lin.pet.dao.CommentMapper;
import com.lin.pet.dao.PreorderMapper;
import com.lin.pet.entity.Comment;
import com.lin.pet.entity.Preorder;
import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.CommentDTO;
import com.lin.pet.entity.dto.output.PreorderSampleDTO;
import com.lin.pet.service.PreorderService;
import com.lin.pet.util.IdWorker;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author lin
 */
@Service
public class PreorderServiceImpl implements PreorderService {
    @Autowired
    PreorderMapper preorderMapper;
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    IdWorker idWorker;
    @Override
    public ServerResponse getPreorderDetail(Long preorderId) {
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse cancelPreorder(Long preorderId) {
        Preorder preorder = new Preorder();
        preorder.setStatus((byte)1);
        preorder.setPreorderId(preorderId);
        preorder.setModifiedTime(new Date());
        preorderMapper.updateByPrimaryKeySelective(preorder);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse commentPreorder(CommentDTO commentDTO) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO,comment);
        comment.setCommentId(idWorker.nextId());
        comment.setCreateTime(new Date());
        comment.setModifiedTime(new Date());
        commentMapper.insert(comment);

        Preorder preorder = new Preorder();
        preorder.setStatus((byte)2);
        preorder.setPreorderId(commentDTO.getPreorderId());
        preorder.setModifiedTime(new Date());
        preorderMapper.updateByPrimaryKeySelective(preorder);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse deletePreorder(Long preorderId) {
        Preorder preorder = new Preorder();
        preorder.setPreorderId(preorderId);
        preorder.setModifiedTime(new Date());
        preorder.setIsDeleted((byte)1);
        preorderMapper.updateByPrimaryKeySelective(preorder);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse getPreorders(Long userId) {
        List<PreorderSampleDTO> preorderSampleDTOS = preorderMapper.selectDetailByUserId(userId);
        return ServerResponse.createBySuccess(preorderSampleDTOS);
    }
}
