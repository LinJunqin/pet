package com.lin.pet.controller;

import com.lin.pet.entity.ServerResponse;

import com.lin.pet.entity.dto.input.CommentDTO;
import com.lin.pet.service.PreorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lin
 */
@RestController
public class PreorderController {
    @Autowired
    PreorderService preorderService;

    @GetMapping(value = "/person/preorders")
    public ServerResponse getPreorders(@RequestParam("userId") Long userId){
        return preorderService.getPreorders(userId);
    }
    @GetMapping(value = "/person/preorder/detail")
    public ServerResponse getPreorderDetail(@RequestParam("preorderId")Long preorderId){
        return preorderService.getPreorderDetail(preorderId);
    }
    @PutMapping(value = "/person/preorder/cancel")
    public ServerResponse cancelPreorder(@RequestParam("preorderId") Long preorderId){
        return preorderService.cancelPreorder(preorderId);
    }
    @PostMapping(value = "/person/preorder/comment")
    public ServerResponse commentPreorder(@RequestBody CommentDTO commentDTO){
        return preorderService.commentPreorder(commentDTO);
    }
    @DeleteMapping(value = "/person/preorder")
    public ServerResponse deletePreorder(@RequestParam("preorderId") Long preorderId){
        return preorderService.deletePreorder(preorderId);
    }
}
