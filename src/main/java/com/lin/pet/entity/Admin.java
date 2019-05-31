package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Admin implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -2046090768919834964L;

    /** 
     */ 
    private Long adminId;

    /** 
     */ 
    private String adminName;

    /** 
     */ 
    private String adminPassword;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     * 构造查询条件
     */
    public Admin(Long adminId, String adminName, String adminPassword, Date createTime, Date modifiedTime) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 构造查询条件
     */
    public Admin() {
        super();
    }

    /** 
     * 获取 admin.admin_id
     * @return admin.admin_id
     */
    public Long getAdminId() {
        return adminId;
    }

    /** 
     * 设置 admin.admin_id
     * @param adminId admin.admin_id
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /** 
     * 获取 admin.admin_name
     * @return admin.admin_name
     */
    public String getAdminName() {
        return adminName;
    }

    /** 
     * 设置 admin.admin_name
     * @param adminName admin.admin_name
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /** 
     * 获取 admin.admin_password
     * @return admin.admin_password
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /** 
     * 设置 admin.admin_password
     * @param adminPassword admin.admin_password
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /** 
     * 获取 admin.create_time
     * @return admin.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 admin.create_time
     * @param createTime admin.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 admin.modified_time
     * @return admin.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 admin.modified_time
     * @param modifiedTime admin.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append("]");
        return sb.toString();
    }
}