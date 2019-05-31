package com.lin.pet.service.impl;


import com.lin.pet.dao.CommentMapper;
import com.lin.pet.dao.HospitalMapper;
import com.lin.pet.dao.PreorderMapper;
import com.lin.pet.dao.ProjectMapper;
import com.lin.pet.entity.Preorder;
import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.ConditionDTO;
import com.lin.pet.entity.dto.input.PreorderDTO;
import com.lin.pet.entity.dto.output.CommentDTO;
import com.lin.pet.entity.dto.output.HospitalDetailDTO;
import com.lin.pet.entity.dto.output.HospitalSimpleDTO;
import com.lin.pet.entity.dto.output.ProjectDTO;
import com.lin.pet.service.HospitalService;
import com.lin.pet.util.IdWorker;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author lin
 */
@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalMapper hospitalMapper;
    @Autowired
    ProjectMapper projectMapper;
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    IdWorker idWorker;
    @Autowired
    PreorderMapper preorderMapper;
    @Override
    public ServerResponse getHospitalOfSearch(String key) {
        List<HospitalSimpleDTO> hospitalDTOS = hospitalMapper.selectByKey(key);
        for(HospitalSimpleDTO hospitalDTO:hospitalDTOS){
            List<String> projectNames = projectMapper.selectByHospitalId(hospitalDTO.getHospitalId());
            hospitalDTO.setProjectNames(projectNames);
            Double score = commentMapper.selectByHospitalId(hospitalDTO.getHospitalId());
            hospitalDTO.setScore(score);
            hospitalDTO.setDistance(RandomUtils.nextDouble(1,9));
        }

        return ServerResponse.createBySuccess(hospitalDTOS);
    }

    @Override
    public ServerResponse getHospitalsOfCondition(ConditionDTO conditionDTO) {
        List<HospitalSimpleDTO> hospitalDTOS = hospitalMapper.selectByType(conditionDTO.getType());
        Iterator<HospitalSimpleDTO> iterator = hospitalDTOS.iterator();
        while (iterator.hasNext()) {
            HospitalSimpleDTO hospitalDTO = iterator.next();
            hospitalDTO.setProjectNames(projectMapper.selectByHospitalId(hospitalDTO.getHospitalId()));
            hospitalDTO.setDistance(RandomUtils.nextDouble(1,9));
            Double score = commentMapper.selectByHospitalId(hospitalDTO.getHospitalId());
            if(score<conditionDTO.getScore()&&score>conditionDTO.getScore()-2.5){
                hospitalDTO.setScore(score);
            }else{
                iterator.remove();
            }
        }
        return ServerResponse.createBySuccess(hospitalDTOS);
    }

    @Override
    public ServerResponse getHospitalDetail(Long hospitalId) {
        HospitalDetailDTO hospitalDetailDTO = hospitalMapper.selectByHospitalId(hospitalId);

            List<ProjectDTO> projectDTOS = projectMapper.selectDetailByHospitalId(hospitalId);
            List<CommentDTO> commentDTOS = commentMapper.selectDetailByHospitalId(hospitalId);
            hospitalDetailDTO.setProjectDTOList(projectDTOS);
            hospitalDetailDTO.setCommentDTOList(commentDTOS);

        return ServerResponse.createBySuccess(hospitalDetailDTO);
    }

    @Override
    public ServerResponse generatePreorder(PreorderDTO preorderDTO) {
        Preorder preorder = new Preorder();
        BeanUtils.copyProperties(preorderDTO,preorder);
        preorder.setCreateTime(new Date());
        preorder.setPreorderId(idWorker.nextId());
        preorder.setIsDeleted((byte)0);
        preorder.setStatus((byte)0);
        preorder.setModifiedTime(new Date());
        preorder.setReason("");
        preorderMapper.insert(preorder);

        return ServerResponse.createBySuccess();
    }
}
