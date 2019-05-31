package com.lin.pet.controller;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.ConditionDTO;
import com.lin.pet.entity.dto.input.HospitalDTO;
import com.lin.pet.entity.dto.input.PreorderDTO;
import com.lin.pet.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lin
 */
@RestController
@RequestMapping(value = "/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;
    @PostMapping(value = "/search")
    public ServerResponse getHospitalOfSearch(@RequestParam("key") String key){
        return hospitalService.getHospitalOfSearch(key);
    }
    @PostMapping(value = "/list/condition")
    public ServerResponse getHospitalsOfCondition(@RequestBody ConditionDTO conditionDTO){
        return hospitalService.getHospitalsOfCondition(conditionDTO);
    }
    @PostMapping(value = "/detail")
    public ServerResponse getHospitalDetail(@RequestParam("hospitalId")Long hospitalId){
        return hospitalService.getHospitalDetail(hospitalId);
    }
    @PostMapping(value = "/preorder")
    public ServerResponse generatePreorder(@RequestBody PreorderDTO preorderDTO){
        return hospitalService.generatePreorder(preorderDTO);
    }

}
