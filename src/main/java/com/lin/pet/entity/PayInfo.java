package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class PayInfo implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -4525968168364729623L;

    /** 
     */ 
    private Long payInfoId;

    /** 
     */ 
    private Long userId;

    /** 
     */ 
    private String plaformName;

    /** 
     */ 
    private String orderNo;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     * 构造查询条件
     */
    public PayInfo(Long payInfoId, Long userId, String plaformName, String orderNo, Date createTime, Date modifiedTime) {
        this.payInfoId = payInfoId;
        this.userId = userId;
        this.plaformName = plaformName;
        this.orderNo = orderNo;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 构造查询条件
     */
    public PayInfo() {
        super();
    }

    /** 
     * 获取 pay_info.pay_info_id
     * @return pay_info.pay_info_id
     */
    public Long getPayInfoId() {
        return payInfoId;
    }

    /** 
     * 设置 pay_info.pay_info_id
     * @param payInfoId pay_info.pay_info_id
     */
    public void setPayInfoId(Long payInfoId) {
        this.payInfoId = payInfoId;
    }

    /** 
     * 获取 pay_info.user_id
     * @return pay_info.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * 设置 pay_info.user_id
     * @param userId pay_info.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 
     * 获取 pay_info.plaform_name
     * @return pay_info.plaform_name
     */
    public String getPlaformName() {
        return plaformName;
    }

    /** 
     * 设置 pay_info.plaform_name
     * @param plaformName pay_info.plaform_name
     */
    public void setPlaformName(String plaformName) {
        this.plaformName = plaformName == null ? null : plaformName.trim();
    }

    /** 
     * 获取 pay_info.order_no
     * @return pay_info.order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /** 
     * 设置 pay_info.order_no
     * @param orderNo pay_info.order_no
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /** 
     * 获取 pay_info.create_time
     * @return pay_info.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 pay_info.create_time
     * @param createTime pay_info.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 pay_info.modified_time
     * @return pay_info.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 pay_info.modified_time
     * @param modifiedTime pay_info.modified_time
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
        sb.append(", payInfoId=").append(payInfoId);
        sb.append(", userId=").append(userId);
        sb.append(", plaformName=").append(plaformName);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append("]");
        return sb.toString();
    }
}