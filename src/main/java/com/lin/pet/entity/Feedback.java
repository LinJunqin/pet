package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Feedback implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -1315451405035608212L;

    /** 
     */ 
    private Long feedbackId;

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
    private Long userId;

    /** 
     * 构造查询条件
     */
    public Feedback(Long feedbackId, String content, Date createTime, Date modifiedTime, Long userId) {
        this.feedbackId = feedbackId;
        this.content = content;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.userId = userId;
    }

    /** 
     * 构造查询条件
     */
    public Feedback() {
        super();
    }

    /** 
     * 获取 feedback.feedback_id
     * @return feedback.feedback_id
     */
    public Long getFeedbackId() {
        return feedbackId;
    }

    /** 
     * 设置 feedback.feedback_id
     * @param feedbackId feedback.feedback_id
     */
    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    /** 
     * 获取 feedback.content
     * @return feedback.content
     */
    public String getContent() {
        return content;
    }

    /** 
     * 设置 feedback.content
     * @param content feedback.content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /** 
     * 获取 feedback.create_time
     * @return feedback.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 feedback.create_time
     * @param createTime feedback.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 feedback.modified_time
     * @return feedback.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 feedback.modified_time
     * @param modifiedTime feedback.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 feedback.user_id
     * @return feedback.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * 设置 feedback.user_id
     * @param userId feedback.user_id
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
        sb.append(", feedbackId=").append(feedbackId);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}