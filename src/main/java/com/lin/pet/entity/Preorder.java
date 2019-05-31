package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Preorder implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 7525481043979278613L;

    /** 
     */ 
    private Long preorderId;

    /** 
     */ 
    private Long hospitalId;

    /** 
     */ 
    private Long projectId;

    /** 
     */ 
    private Long userId;

    /** 
     */ 
    private String arriveTime;

    /** 
     */ 
    private Byte status;

    /** 
     */ 
    private String reason;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private Byte isDeleted;

    /** 
     * 构造查询条件
     */
    public Preorder(Long preorderId, Long hospitalId, Long projectId, Long userId, String arriveTime, Byte status, String reason, Date createTime, Date modifiedTime, Byte isDeleted) {
        this.preorderId = preorderId;
        this.hospitalId = hospitalId;
        this.projectId = projectId;
        this.userId = userId;
        this.arriveTime = arriveTime;
        this.status = status;
        this.reason = reason;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.isDeleted = isDeleted;
    }

    /** 
     * 构造查询条件
     */
    public Preorder() {
        super();
    }

    /** 
     * 获取 preorder.preorder_id
     * @return preorder.preorder_id
     */
    public Long getPreorderId() {
        return preorderId;
    }

    /** 
     * 设置 preorder.preorder_id
     * @param preorderId preorder.preorder_id
     */
    public void setPreorderId(Long preorderId) {
        this.preorderId = preorderId;
    }

    /** 
     * 获取 preorder.hospital_id
     * @return preorder.hospital_id
     */
    public Long getHospitalId() {
        return hospitalId;
    }

    /** 
     * 设置 preorder.hospital_id
     * @param hospitalId preorder.hospital_id
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /** 
     * 获取 preorder.project_id
     * @return preorder.project_id
     */
    public Long getProjectId() {
        return projectId;
    }

    /** 
     * 设置 preorder.project_id
     * @param projectId preorder.project_id
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /** 
     * 获取 preorder.user_id
     * @return preorder.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * 设置 preorder.user_id
     * @param userId preorder.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 
     * 获取 preorder.arrive_time
     * @return preorder.arrive_time
     */
    public String getArriveTime() {
        return arriveTime;
    }

    /** 
     * 设置 preorder.arrive_time
     * @param arriveTime preorder.arrive_time
     */
    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime == null ? null : arriveTime.trim();
    }

    /** 
     * 获取 preorder.status
     * @return preorder.status
     */
    public Byte getStatus() {
        return status;
    }

    /** 
     * 设置 preorder.status
     * @param status preorder.status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /** 
     * 获取 preorder.reason
     * @return preorder.reason
     */
    public String getReason() {
        return reason;
    }

    /** 
     * 设置 preorder.reason
     * @param reason preorder.reason
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /** 
     * 获取 preorder.create_time
     * @return preorder.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 preorder.create_time
     * @param createTime preorder.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 preorder.modified_time
     * @return preorder.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 preorder.modified_time
     * @param modifiedTime preorder.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 preorder.is_deleted
     * @return preorder.is_deleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /** 
     * 设置 preorder.is_deleted
     * @param isDeleted preorder.is_deleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", preorderId=").append(preorderId);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", projectId=").append(projectId);
        sb.append(", userId=").append(userId);
        sb.append(", arriveTime=").append(arriveTime);
        sb.append(", status=").append(status);
        sb.append(", reason=").append(reason);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}