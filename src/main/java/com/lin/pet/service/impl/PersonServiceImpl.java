package com.lin.pet.service.impl;


import com.lin.pet.dao.AddressMapper;
import com.lin.pet.dao.FeedbackMapper;
import com.lin.pet.dao.UserMapper;
import com.lin.pet.entity.Address;
import com.lin.pet.entity.Feedback;
import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.User;
import com.lin.pet.entity.dto.input.AddressDTO;
import com.lin.pet.entity.dto.input.UserDTO;
import com.lin.pet.service.FileService;
import com.lin.pet.service.PersonService;
import com.lin.pet.util.IdWorker;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.Date;
import java.util.List;

/**
 * @author lin
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    FileService fileService;
    @Autowired
    IdWorker idWorker;
    @Autowired
    FeedbackMapper feedbackMapper;
    @Autowired
    AddressMapper addressMapper;
    @Override
    public ServerResponse<String> changeAvatar(Long userId, MultipartFile file) {
        User user = userMapper.selectByPrimaryKey(userId);
        String avatar = fileService.saveImageToQiniu(file);
        user.setAvatar(avatar);
        user.setModifiedTime(new Date());
        userMapper.updateByPrimaryKeySelective(user);
        return ServerResponse.createBySuccess(avatar);
    }

    @Override
    public ServerResponse changeInfo(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        user.setModifiedTime(new Date());
        userMapper.updateByPrimaryKeySelective(user);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse summitFeedback(Long userId, String content) {
        Feedback feedback = new Feedback();
        feedback.setContent(content);
        feedback.setCreateTime(new Date());
        feedback.setFeedbackId(idWorker.nextId());
        feedback.setModifiedTime(new Date());
        feedback.setUserId(userId);
        feedbackMapper.insert(feedback);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse addAddress(AddressDTO addressDTO) {
        if(addressDTO.getIsMain()==(byte)1){
            addressMapper.updateMainByUserId(addressDTO.getUserId());
        }
        Address address = new Address();
        BeanUtils.copyProperties(addressDTO,address);
        address.setAddressId(idWorker.nextId());
        address.setCreateTime(new Date());
        address.setModifiedTime(new Date());
        addressMapper.insertSelective(address);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse deleteAddress(Long addressId) {
        addressMapper.deleteByPrimaryKey(addressId);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse modifyAddress(AddressDTO addressDTO) {
        if(addressDTO.getIsMain()==(byte)1){
            addressMapper.updateMainByUserId(addressDTO.getUserId());
        }
        Address address = new Address();
        BeanUtils.copyProperties(addressDTO,address);
        address.setModifiedTime(new Date());
        addressMapper.updateByPrimaryKeySelective(address);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse getAllAddress(Long userId) {
        List<Address> addresses = addressMapper.selectAll(userId);
        return ServerResponse.createBySuccess(addresses);
    }

    @Override
    public ServerResponse getAddress(Long userId) {
        Address address = addressMapper.selectByUserId(userId);
        return ServerResponse.createBySuccess(address);
    }
}
