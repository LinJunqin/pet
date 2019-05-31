package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Store implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 264790628056866797L;

    /** 
     */ 
    private Long storeId;

    /** 
     */ 
    private String ownerPhone;

    /** 
     */ 
    private String ownerName;

    /** 
     */ 
    private String ownerPassword;

    /** 
     */ 
    private String storeName;

    /** 
     */ 
    private String storeAvatar;

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
     * 构造查询条件
     */
    public Store(Long storeId, String ownerPhone, String ownerName, String ownerPassword, String storeName, String storeAvatar, Byte isDeleted, Date createTime, Date modifiedTime) {
        this.storeId = storeId;
        this.ownerPhone = ownerPhone;
        this.ownerName = ownerName;
        this.ownerPassword = ownerPassword;
        this.storeName = storeName;
        this.storeAvatar = storeAvatar;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 构造查询条件
     */
    public Store() {
        super();
    }

    /** 
     * 获取 store.store_id
     * @return store.store_id
     */
    public Long getStoreId() {
        return storeId;
    }

    /** 
     * 设置 store.store_id
     * @param storeId store.store_id
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /** 
     * 获取 store.owner_phone
     * @return store.owner_phone
     */
    public String getOwnerPhone() {
        return ownerPhone;
    }

    /** 
     * 设置 store.owner_phone
     * @param ownerPhone store.owner_phone
     */
    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    /** 
     * 获取 store.owner_name
     * @return store.owner_name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /** 
     * 设置 store.owner_name
     * @param ownerName store.owner_name
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /** 
     * 获取 store.owner_password
     * @return store.owner_password
     */
    public String getOwnerPassword() {
        return ownerPassword;
    }

    /** 
     * 设置 store.owner_password
     * @param ownerPassword store.owner_password
     */
    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword == null ? null : ownerPassword.trim();
    }

    /** 
     * 获取 store.store_name
     * @return store.store_name
     */
    public String getStoreName() {
        return storeName;
    }

    /** 
     * 设置 store.store_name
     * @param storeName store.store_name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /** 
     * 获取 store.store_avatar
     * @return store.store_avatar
     */
    public String getStoreAvatar() {
        return storeAvatar;
    }

    /** 
     * 设置 store.store_avatar
     * @param storeAvatar store.store_avatar
     */
    public void setStoreAvatar(String storeAvatar) {
        this.storeAvatar = storeAvatar == null ? null : storeAvatar.trim();
    }

    /** 
     * 获取 store.is_deleted
     * @return store.is_deleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /** 
     * 设置 store.is_deleted
     * @param isDeleted store.is_deleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /** 
     * 获取 store.create_time
     * @return store.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 store.create_time
     * @param createTime store.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 store.modified_time
     * @return store.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 store.modified_time
     * @param modifiedTime store.modified_time
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
        sb.append(", storeId=").append(storeId);
        sb.append(", ownerPhone=").append(ownerPhone);
        sb.append(", ownerName=").append(ownerName);
        sb.append(", ownerPassword=").append(ownerPassword);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeAvatar=").append(storeAvatar);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append("]");
        return sb.toString();
    }
}