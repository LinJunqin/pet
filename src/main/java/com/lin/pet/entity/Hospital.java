package com.lin.pet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Hospital implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 884320175375119152L;

    /** 
     */ 
    private Long hospitalId;

    /** 
     */ 
    private String hospitalName;

    /** 
     */ 
    private String hospitalPhone;

    /** 
     */ 
    private String avatar;

    /** 
     */ 
    private String address;

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
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private String beginTime;

    /** 
     */ 
    private String endTime;

    /** 
     */ 
    private Byte isDeleted;

    /** 
     */ 
    private Byte type;

    /** 
     */ 
    private BigDecimal lon;

    /** 
     */ 
    private BigDecimal lat;

    /** 
     * 构造查询条件
     */
    public Hospital(Long hospitalId, String hospitalName, String hospitalPhone, String avatar, String address, String ownerPhone, String ownerName, String ownerPassword, Date createTime, Date modifiedTime, String beginTime, String endTime, Byte isDeleted, Byte type, BigDecimal lon, BigDecimal lat) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalPhone = hospitalPhone;
        this.avatar = avatar;
        this.address = address;
        this.ownerPhone = ownerPhone;
        this.ownerName = ownerName;
        this.ownerPassword = ownerPassword;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.isDeleted = isDeleted;
        this.type = type;
        this.lon = lon;
        this.lat = lat;
    }

    /** 
     * 构造查询条件
     */
    public Hospital() {
        super();
    }

    /** 
     * 获取 hospital.hospital_id
     * @return hospital.hospital_id
     */
    public Long getHospitalId() {
        return hospitalId;
    }

    /** 
     * 设置 hospital.hospital_id
     * @param hospitalId hospital.hospital_id
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /** 
     * 获取 hospital.hospital_name
     * @return hospital.hospital_name
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /** 
     * 设置 hospital.hospital_name
     * @param hospitalName hospital.hospital_name
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    /** 
     * 获取 hospital.hospital_phone
     * @return hospital.hospital_phone
     */
    public String getHospitalPhone() {
        return hospitalPhone;
    }

    /** 
     * 设置 hospital.hospital_phone
     * @param hospitalPhone hospital.hospital_phone
     */
    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone == null ? null : hospitalPhone.trim();
    }

    /** 
     * 获取 hospital.avatar
     * @return hospital.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /** 
     * 设置 hospital.avatar
     * @param avatar hospital.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /** 
     * 获取 hospital.address
     * @return hospital.address
     */
    public String getAddress() {
        return address;
    }

    /** 
     * 设置 hospital.address
     * @param address hospital.address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /** 
     * 获取 hospital.owner_phone
     * @return hospital.owner_phone
     */
    public String getOwnerPhone() {
        return ownerPhone;
    }

    /** 
     * 设置 hospital.owner_phone
     * @param ownerPhone hospital.owner_phone
     */
    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    /** 
     * 获取 hospital.owner_name
     * @return hospital.owner_name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /** 
     * 设置 hospital.owner_name
     * @param ownerName hospital.owner_name
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /** 
     * 获取 hospital.owner_password
     * @return hospital.owner_password
     */
    public String getOwnerPassword() {
        return ownerPassword;
    }

    /** 
     * 设置 hospital.owner_password
     * @param ownerPassword hospital.owner_password
     */
    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword == null ? null : ownerPassword.trim();
    }

    /** 
     * 获取 hospital.create_time
     * @return hospital.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 hospital.create_time
     * @param createTime hospital.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 hospital.modified_time
     * @return hospital.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 hospital.modified_time
     * @param modifiedTime hospital.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 hospital.begin_time
     * @return hospital.begin_time
     */
    public String getBeginTime() {
        return beginTime;
    }

    /** 
     * 设置 hospital.begin_time
     * @param beginTime hospital.begin_time
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    /** 
     * 获取 hospital.end_time
     * @return hospital.end_time
     */
    public String getEndTime() {
        return endTime;
    }

    /** 
     * 设置 hospital.end_time
     * @param endTime hospital.end_time
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /** 
     * 获取 hospital.is_deleted
     * @return hospital.is_deleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /** 
     * 设置 hospital.is_deleted
     * @param isDeleted hospital.is_deleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /** 
     * 获取 hospital.type
     * @return hospital.type
     */
    public Byte getType() {
        return type;
    }

    /** 
     * 设置 hospital.type
     * @param type hospital.type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /** 
     * 获取 hospital.lon
     * @return hospital.lon
     */
    public BigDecimal getLon() {
        return lon;
    }

    /** 
     * 设置 hospital.lon
     * @param lon hospital.lon
     */
    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    /** 
     * 获取 hospital.lat
     * @return hospital.lat
     */
    public BigDecimal getLat() {
        return lat;
    }

    /** 
     * 设置 hospital.lat
     * @param lat hospital.lat
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", hospitalPhone=").append(hospitalPhone);
        sb.append(", avatar=").append(avatar);
        sb.append(", address=").append(address);
        sb.append(", ownerPhone=").append(ownerPhone);
        sb.append(", ownerName=").append(ownerName);
        sb.append(", ownerPassword=").append(ownerPassword);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", type=").append(type);
        sb.append(", lon=").append(lon);
        sb.append(", lat=").append(lat);
        sb.append("]");
        return sb.toString();
    }
}