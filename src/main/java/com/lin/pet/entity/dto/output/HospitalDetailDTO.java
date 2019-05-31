package com.lin.pet.entity.dto.output;

import java.util.List;

public class HospitalDetailDTO {
    /**
     */
    private Long hospitalId;

    /**
     */
    private String hospitalName;


    /**
     */
    private String avatar;

    /**
     */
    private String hospitalPhone;
    /**
     */
    private String address;

    public HospitalDetailDTO() {
    }

    public HospitalDetailDTO(Long hospitalId, String hospitalName, String avatar, String hospitalPhone, String address) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.avatar = avatar;
        this.hospitalPhone = hospitalPhone;
        this.address = address;
    }

    private List<ProjectDTO> projectDTOList;
    private List<CommentDTO> commentDTOList;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ProjectDTO> getProjectDTOList() {
        return projectDTOList;
    }

    public void setProjectDTOList(List<ProjectDTO> projectDTOList) {
        this.projectDTOList = projectDTOList;
    }

    public List<CommentDTO> getCommentDTOList() {
        return commentDTOList;
    }

    public void setCommentDTOList(List<CommentDTO> commentDTOList) {
        this.commentDTOList = commentDTOList;
    }
}
