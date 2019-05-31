package com.lin.pet.service;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.ConditionDTO;
import com.lin.pet.entity.dto.input.PreorderDTO;

/**
 * @author lin
 */
public interface HospitalService {
    ServerResponse getHospitalOfSearch(String key);
    ServerResponse getHospitalsOfCondition(ConditionDTO conditionDTO);
    ServerResponse getHospitalDetail(Long hospitalId);
    ServerResponse generatePreorder(PreorderDTO preorderDTO);
}
