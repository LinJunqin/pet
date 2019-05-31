package com.lin.pet.service;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.CommentDTO;

/**
 * @author lin
 */
public interface PreorderService {
    ServerResponse getPreorderDetail(Long preorderId);
    ServerResponse cancelPreorder(Long preorderId);
    ServerResponse commentPreorder(CommentDTO commentDTO);
    ServerResponse deletePreorder(Long preorderId);
    ServerResponse getPreorders(Long userId);
}
