package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Reply implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -2518905731043174821L;

    /** 
     */ 
    private Long replyId;

    /** 
     */ 
    private String commentId;

    /** 
     */ 
    private String content;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date mofidiedTime;

    /** 
     * 构造查询条件
     */
    public Reply(Long replyId, String commentId, String content, Date createTime, Date mofidiedTime) {
        this.replyId = replyId;
        this.commentId = commentId;
        this.content = content;
        this.createTime = createTime;
        this.mofidiedTime = mofidiedTime;
    }

    /** 
     * 构造查询条件
     */
    public Reply() {
        super();
    }

    /** 
     * 获取 reply.reply_id
     * @return reply.reply_id
     */
    public Long getReplyId() {
        return replyId;
    }

    /** 
     * 设置 reply.reply_id
     * @param replyId reply.reply_id
     */
    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    /** 
     * 获取 reply.comment_id
     * @return reply.comment_id
     */
    public String getCommentId() {
        return commentId;
    }

    /** 
     * 设置 reply.comment_id
     * @param commentId reply.comment_id
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    /** 
     * 获取 reply.content
     * @return reply.content
     */
    public String getContent() {
        return content;
    }

    /** 
     * 设置 reply.content
     * @param content reply.content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /** 
     * 获取 reply.create_time
     * @return reply.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 reply.create_time
     * @param createTime reply.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 reply.mofidied_time
     * @return reply.mofidied_time
     */
    public Date getMofidiedTime() {
        return mofidiedTime;
    }

    /** 
     * 设置 reply.mofidied_time
     * @param mofidiedTime reply.mofidied_time
     */
    public void setMofidiedTime(Date mofidiedTime) {
        this.mofidiedTime = mofidiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", replyId=").append(replyId);
        sb.append(", commentId=").append(commentId);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", mofidiedTime=").append(mofidiedTime);
        sb.append("]");
        return sb.toString();
    }
}