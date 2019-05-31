package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class ReceiverAddress implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 8182541982643337724L;

    /** 
     */ 
    private Long receiverAddressId;

    /** 
     */ 
    private Long orderId;

    /** 
     */ 
    private String province;

    /** 
     */ 
    private String city;

    /** 
     */ 
    private String county;

    /** 
     */ 
    private String detail;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private String phone;

    /** 
     */ 
    private String recevierName;

    /** 
     * 构造查询条件
     */
    public ReceiverAddress(Long receiverAddressId, Long orderId, String province, String city, String county, String detail, Date createTime, Date modifiedTime, String phone, String recevierName) {
        this.receiverAddressId = receiverAddressId;
        this.orderId = orderId;
        this.province = province;
        this.city = city;
        this.county = county;
        this.detail = detail;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.phone = phone;
        this.recevierName = recevierName;
    }

    /** 
     * 构造查询条件
     */
    public ReceiverAddress() {
        super();
    }

    /** 
     * 获取 receiver_address.receiver_address_id
     * @return receiver_address.receiver_address_id
     */
    public Long getReceiverAddressId() {
        return receiverAddressId;
    }

    /** 
     * 设置 receiver_address.receiver_address_id
     * @param receiverAddressId receiver_address.receiver_address_id
     */
    public void setReceiverAddressId(Long receiverAddressId) {
        this.receiverAddressId = receiverAddressId;
    }

    /** 
     * 获取 receiver_address.order_id
     * @return receiver_address.order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /** 
     * 设置 receiver_address.order_id
     * @param orderId receiver_address.order_id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /** 
     * 获取 receiver_address.province
     * @return receiver_address.province
     */
    public String getProvince() {
        return province;
    }

    /** 
     * 设置 receiver_address.province
     * @param province receiver_address.province
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /** 
     * 获取 receiver_address.city
     * @return receiver_address.city
     */
    public String getCity() {
        return city;
    }

    /** 
     * 设置 receiver_address.city
     * @param city receiver_address.city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /** 
     * 获取 receiver_address.county
     * @return receiver_address.county
     */
    public String getCounty() {
        return county;
    }

    /** 
     * 设置 receiver_address.county
     * @param county receiver_address.county
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /** 
     * 获取 receiver_address.detail
     * @return receiver_address.detail
     */
    public String getDetail() {
        return detail;
    }

    /** 
     * 设置 receiver_address.detail
     * @param detail receiver_address.detail
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /** 
     * 获取 receiver_address.create_time
     * @return receiver_address.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 receiver_address.create_time
     * @param createTime receiver_address.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 receiver_address.modified_time
     * @return receiver_address.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 receiver_address.modified_time
     * @param modifiedTime receiver_address.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 receiver_address.phone
     * @return receiver_address.phone
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * 设置 receiver_address.phone
     * @param phone receiver_address.phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /** 
     * 获取 receiver_address.recevier_name
     * @return receiver_address.recevier_name
     */
    public String getRecevierName() {
        return recevierName;
    }

    /** 
     * 设置 receiver_address.recevier_name
     * @param recevierName receiver_address.recevier_name
     */
    public void setRecevierName(String recevierName) {
        this.recevierName = recevierName == null ? null : recevierName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", receiverAddressId=").append(receiverAddressId);
        sb.append(", orderId=").append(orderId);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", detail=").append(detail);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", phone=").append(phone);
        sb.append(", recevierName=").append(recevierName);
        sb.append("]");
        return sb.toString();
    }
}