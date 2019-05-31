package com.lin.pet.entity.dto.output;

import java.util.Date;

public class CommentDTO {

    /**
     */
    private Long commentId;

    /**
     */
    private String content;

    /**
     */
    private Date createTime;
    /**
     */
    private Long userId;
    private String username;
    private String avatar;

    public CommentDTO(Long commentId, String content, Date createTime, Long userId, String username, String avatar) {
        this.commentId = commentId;
        this.content = content;
        this.createTime = createTime;
        this.userId = userId;
        this.username = username;
        this.avatar = avatar;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
