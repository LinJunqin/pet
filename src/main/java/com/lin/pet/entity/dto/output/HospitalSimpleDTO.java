package com.lin.pet.entity.dto.output;

import java.util.List;

public class HospitalSimpleDTO {

    /**
     */
    private Long hospitalId;

    /**
     */
    private String hospitalName;


    /**
     */
    private String avatar;

    private List<String > projectNames;

    private Byte type;
    private Double distance;
    private Double score;

    public HospitalSimpleDTO() {
    }

    public HospitalSimpleDTO(Long hospitalId, String hospitalName, String avatar, Byte type) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.avatar = avatar;
        this.type = type;
    }

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

    public List<String> getProjectNames() {
        return projectNames;
    }

    public void setProjectNames(List<String> projectNames) {
        this.projectNames = projectNames;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
