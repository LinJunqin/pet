package com.lin.pet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Comment implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -660005766873230433L;

    /** 
     */ 
    private Long commentId;

    /** 
     */ 
    private Long preorderId;

    /** 
     */ 
    private BigDecimal score;

    /** 
     */ 
    private String content;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private Long hospitalId;

    /** 
     */ 
    private Long userId;

    /** 
     * 构造查询条件
     */
    public Comment(Long commentId, Long preorderId, BigDecimal score, String content, Date createTime, Date modifiedTime, Long hospitalId, Long userId) {
        this.commentId = commentId;
        this.preorderId = preorderId;
        this.score = score;
        this.content = content;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.hospitalId = hospitalId;
        this.userId = userId;
    }

    /** 
     * 构造查询条件
     */
    public Comment() {
        super();
    }

    /** 
     * 获取 comment.comment_id
     * @return comment.comment_id
     */
    public Long getCommentId() {
        return commentId;
    }

    /** 
     * 设置 comment.comment_id
     * @param commentId comment.comment_id
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /** 
     * 获取 comment.preorder_id
     * @return comment.preorder_id
     */
    public Long getPreorderId() {
        return preorderId;
    }

    /** 
     * 设置 comment.preorder_id
     * @param preorderId comment.preorder_id
     */
    public void setPreorderId(Long preorderId) {
        this.preorderId = preorderId;
    }

    /** 
     * 获取 comment.score
     * @return comment.score
     */
    public BigDecimal getScore() {
        return score;
    }

    /** 
     * 设置 comment.score
     * @param score comment.score
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /** 
     * 获取 comment.content
     * @return comment.content
     */
    public String getContent() {
        return content;
    }

    /** 
     * 设置 comment.content
     * @param content comment.content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /** 
     * 获取 comment.create_time
     * @return comment.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 comment.create_time
     * @param createTime comment.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 comment.modified_time
     * @return comment.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 comment.modified_time
     * @param modifiedTime comment.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 comment.hospital_id
     * @return comment.hospital_id
     */
    public Long getHospitalId() {
        return hospitalId;
    }

    /** 
     * 设置 comment.hospital_id
     * @param hospitalId comment.hospital_id
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /** 
     * 获取 comment.user_id
     * @return comment.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * 设置 comment.user_id
     * @param userId comment.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commentId=").append(commentId);
        sb.append(", preorderId=").append(preorderId);
        sb.append(", score=").append(score);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}