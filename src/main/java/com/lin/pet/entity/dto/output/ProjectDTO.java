package com.lin.pet.entity.dto.output;

import java.math.BigDecimal;

public class ProjectDTO {
    /**
     */
    private Long projectId;
    /**
     */
    private String title;
    /**
     */
    private BigDecimal value;

    public ProjectDTO() {
    }

    public ProjectDTO(Long projectId, String title, BigDecimal value) {
        this.projectId = projectId;
        this.title = title;
        this.value = value;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
