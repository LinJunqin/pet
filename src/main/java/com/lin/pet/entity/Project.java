package com.lin.pet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Project implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 2470864648825350018L;

    /** 
     */ 
    private Long projectId;

    /** 
     */ 
    private Long hospitalId;

    /** 
     */ 
    private String title;

    /** 
     */ 
    private String content;

    /** 
     */ 
    private Byte isDeleted;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private BigDecimal value;

    /** 
     * 构造查询条件
     */
    public Project(Long projectId, Long hospitalId, String title, String content, Byte isDeleted, Date createTime, Date modifiedTime, BigDecimal value) {
        this.projectId = projectId;
        this.hospitalId = hospitalId;
        this.title = title;
        this.content = content;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.value = value;
    }

    /** 
     * 构造查询条件
     */
    public Project() {
        super();
    }

    /** 
     * 获取 project.project_id
     * @return project.project_id
     */
    public Long getProjectId() {
        return projectId;
    }

    /** 
     * 设置 project.project_id
     * @param projectId project.project_id
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /** 
     * 获取 project.hospital_id
     * @return project.hospital_id
     */
    public Long getHospitalId() {
        return hospitalId;
    }

    /** 
     * 设置 project.hospital_id
     * @param hospitalId project.hospital_id
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /** 
     * 获取 project.title
     * @return project.title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * 设置 project.title
     * @param title project.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /** 
     * 获取 project.content
     * @return project.content
     */
    public String getContent() {
        return content;
    }

    /** 
     * 设置 project.content
     * @param content project.content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /** 
     * 获取 project.is_deleted
     * @return project.is_deleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /** 
     * 设置 project.is_deleted
     * @param isDeleted project.is_deleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /** 
     * 获取 project.create_time
     * @return project.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 project.create_time
     * @param createTime project.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 project.modified_time
     * @return project.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 project.modified_time
     * @param modifiedTime project.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 project.value
     * @return project.value
     */
    public BigDecimal getValue() {
        return value;
    }

    /** 
     * 设置 project.value
     * @param value project.value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", projectId=").append(projectId);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", value=").append(value);
        sb.append("]");
        return sb.toString();
    }
}