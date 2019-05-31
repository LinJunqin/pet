package com.lin.pet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Order implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 3948528122650758935L;

    /** 
     */ 
    private Long orderId;

    /** 
     */ 
    private Long userId;

    /** 
     */ 
    private Long storeId;

    /** 
     */ 
    private Long goodsId;

    /** 
     */ 
    private Byte sum;

    /** 
     */ 
    private BigDecimal account;

    /** 
     */ 
    private String logisticsNum;

    /** 
     */ 
    private String logisticsCompany;

    /** 
     */ 
    private Byte status;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     */ 
    private Byte isDeleted;

    /** 
     * 构造查询条件
     */
    public Order(Long orderId, Long userId, Long storeId, Long goodsId, Byte sum, BigDecimal account, String logisticsNum, String logisticsCompany, Byte status, Date createTime, Date modifiedTime, Byte isDeleted) {
        this.orderId = orderId;
        this.userId = userId;
        this.storeId = storeId;
        this.goodsId = goodsId;
        this.sum = sum;
        this.account = account;
        this.logisticsNum = logisticsNum;
        this.logisticsCompany = logisticsCompany;
        this.status = status;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.isDeleted = isDeleted;
    }

    /** 
     * 构造查询条件
     */
    public Order() {
        super();
    }

    /** 
     * 获取 order.order_id
     * @return order.order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /** 
     * 设置 order.order_id
     * @param orderId order.order_id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /** 
     * 获取 order.user_id
     * @return order.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * 设置 order.user_id
     * @param userId order.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 
     * 获取 order.store_id
     * @return order.store_id
     */
    public Long getStoreId() {
        return storeId;
    }

    /** 
     * 设置 order.store_id
     * @param storeId order.store_id
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /** 
     * 获取 order.goods_id
     * @return order.goods_id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /** 
     * 设置 order.goods_id
     * @param goodsId order.goods_id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /** 
     * 获取 order.sum
     * @return order.sum
     */
    public Byte getSum() {
        return sum;
    }

    /** 
     * 设置 order.sum
     * @param sum order.sum
     */
    public void setSum(Byte sum) {
        this.sum = sum;
    }

    /** 
     * 获取 order.account
     * @return order.account
     */
    public BigDecimal getAccount() {
        return account;
    }

    /** 
     * 设置 order.account
     * @param account order.account
     */
    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    /** 
     * 获取 order.logistics_num
     * @return order.logistics_num
     */
    public String getLogisticsNum() {
        return logisticsNum;
    }

    /** 
     * 设置 order.logistics_num
     * @param logisticsNum order.logistics_num
     */
    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    /** 
     * 获取 order.logistics_company
     * @return order.logistics_company
     */
    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    /** 
     * 设置 order.logistics_company
     * @param logisticsCompany order.logistics_company
     */
    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    /** 
     * 获取 order.status
     * @return order.status
     */
    public Byte getStatus() {
        return status;
    }

    /** 
     * 设置 order.status
     * @param status order.status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /** 
     * 获取 order.create_time
     * @return order.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 order.create_time
     * @param createTime order.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 order.modified_time
     * @return order.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 order.modified_time
     * @param modifiedTime order.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 order.is_deleted
     * @return order.is_deleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /** 
     * 设置 order.is_deleted
     * @param isDeleted order.is_deleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", storeId=").append(storeId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", sum=").append(sum);
        sb.append(", account=").append(account);
        sb.append(", logisticsNum=").append(logisticsNum);
        sb.append(", logisticsCompany=").append(logisticsCompany);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}