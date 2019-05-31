package com.lin.pet.service;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.AddressDTO;
import com.lin.pet.entity.dto.input.UserDTO;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

/**
 * @author lin
 */
public interface PersonService {
   ServerResponse changeAvatar(Long userId, MultipartFile file);
   ServerResponse changeInfo(UserDTO userDTO);
   ServerResponse summitFeedback(Long userId,String content);


   ServerResponse addAddress(AddressDTO addressDTO);

   ServerResponse deleteAddress(Long addressId);

   ServerResponse modifyAddress(AddressDTO addressDTO);

   ServerResponse getAllAddress(Long userId);

   ServerResponse getAddress(Long userId);
}
