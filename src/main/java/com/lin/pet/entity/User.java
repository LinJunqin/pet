package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class User implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -6612667984208267496L;

    /** 
     */ 
    private Long userId;

    /** 
     */ 
    private String phone;

    /** 
     */ 
    private String username;

    /** 
     */ 
    private Boolean gender;

    /** 
     */ 
    private String avatar;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private Date loginTime;

    /** 
     * 构造查询条件
     */
    public User(Long userId, String phone, String username, Boolean gender, String avatar, Date createTime, Date modifiedTime, Date loginTime) {
        this.userId = userId;
        this.phone = phone;
        this.username = username;
        this.gender = gender;
        this.avatar = avatar;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.loginTime = loginTime;
    }

    /** 
     * 构造查询条件
     */
    public User() {
        super();
    }

    /** 
     * 获取 user.user_id
     * @return user.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * 设置 user.user_id
     * @param userId user.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 
     * 获取 user.phone
     * @return user.phone
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * 设置 user.phone
     * @param phone user.phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /** 
     * 获取 user.username
     * @return user.username
     */
    public String getUsername() {
        return username;
    }

    /** 
     * 设置 user.username
     * @param username user.username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /** 
     * 获取 user.gender
     * @return user.gender
     */
    public Boolean getGender() {
        return gender;
    }

    /** 
     * 设置 user.gender
     * @param gender user.gender
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /** 
     * 获取 user.avatar
     * @return user.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /** 
     * 设置 user.avatar
     * @param avatar user.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /** 
     * 获取 user.create_time
     * @return user.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 user.create_time
     * @param createTime user.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 user.modified_time
     * @return user.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 user.modified_time
     * @param modifiedTime user.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 user.login_time
     * @return user.login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /** 
     * 设置 user.login_time
     * @param loginTime user.login_time
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", username=").append(username);
        sb.append(", gender=").append(gender);
        sb.append(", avatar=").append(avatar);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append("]");
        return sb.toString();
    }
}