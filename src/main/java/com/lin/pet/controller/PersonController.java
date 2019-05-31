package com.lin.pet.controller;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.AddressDTO;
import com.lin.pet.entity.dto.input.UserDTO;
import com.lin.pet.exception.BadRequestException;
import com.lin.pet.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

/**
 * @author lin
 */
@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping(value = "/person/avatar")
    public ServerResponse changeAvatar(@RequestParam("userId") Long userId,
                                       @RequestParam("file") MultipartFile file ){
        return personService.changeAvatar(userId,file);
    }
    @PostMapping(value = "/person/info")
    public ServerResponse changeInfo(@RequestBody UserDTO userDTO){
        return personService.changeInfo(userDTO);
    }
    @PostMapping(value = "/person/feedback")
    public ServerResponse summitFeedback(@RequestParam("userId") Long userId,@RequestParam("content") String content){
        return personService.summitFeedback(userId,content);
    }

    @PostMapping(value = "/person/addAddress")
    public ServerResponse addAddress(@RequestBody AddressDTO addressDTO){
        return  personService.addAddress(addressDTO);
    }

    @PostMapping(value = "/person/deleteAddress")
    public ServerResponse deleteAddress(@RequestParam("addressId") Long addressId){
        return personService.deleteAddress(addressId);
    }

    @PostMapping(value = "/person/modifyAddress")
    public ServerResponse modifyAddress(@RequestBody AddressDTO addressDTO){


        return  personService.modifyAddress(addressDTO);
    }

    @GetMapping(value = "/person/getAllAddress")
    public ServerResponse getAllAddress(@RequestParam("userId") Long userId){
        return personService.getAllAddress(userId);
    }
    @GetMapping(value = "/person/getAddress")
    public ServerResponse getAddress(@RequestParam("userId") Long userId){
        return personService.getAddress(userId);
    }
}
