package com.lin.pet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class Goods implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 7708019844656281037L;

    /** 
     */ 
    private Long goodsId;

    /** 
     */ 
    private Long storeId;

    /** 
     */ 
    private String name;

    /** 
     */ 
    private Short sum;

    /** 
     */ 
    private BigDecimal price;

    /** 
     */ 
    private String avatar;

    /** 
     */ 
    private String detailImage;

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
    public Goods(Long goodsId, Long storeId, String name, Short sum, BigDecimal price, String avatar, String detailImage, Date createTime, Date modifiedTime, Byte isDeleted) {
        this.goodsId = goodsId;
        this.storeId = storeId;
        this.name = name;
        this.sum = sum;
        this.price = price;
        this.avatar = avatar;
        this.detailImage = detailImage;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.isDeleted = isDeleted;
    }

    /** 
     * 构造查询条件
     */
    public Goods() {
        super();
    }

    /** 
     * 获取 goods.goods_id
     * @return goods.goods_id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /** 
     * 设置 goods.goods_id
     * @param goodsId goods.goods_id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /** 
     * 获取 goods.store_id
     * @return goods.store_id
     */
    public Long getStoreId() {
        return storeId;
    }

    /** 
     * 设置 goods.store_id
     * @param storeId goods.store_id
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /** 
     * 获取 goods.name
     * @return goods.name
     */
    public String getName() {
        return name;
    }

    /** 
     * 设置 goods.name
     * @param name goods.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /** 
     * 获取 goods.sum
     * @return goods.sum
     */
    public Short getSum() {
        return sum;
    }

    /** 
     * 设置 goods.sum
     * @param sum goods.sum
     */
    public void setSum(Short sum) {
        this.sum = sum;
    }

    /** 
     * 获取 goods.price
     * @return goods.price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /** 
     * 设置 goods.price
     * @param price goods.price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /** 
     * 获取 goods.avatar
     * @return goods.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /** 
     * 设置 goods.avatar
     * @param avatar goods.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /** 
     * 获取 goods.detail_image
     * @return goods.detail_image
     */
    public String getDetailImage() {
        return detailImage;
    }

    /** 
     * 设置 goods.detail_image
     * @param detailImage goods.detail_image
     */
    public void setDetailImage(String detailImage) {
        this.detailImage = detailImage == null ? null : detailImage.trim();
    }

    /** 
     * 获取 goods.create_time
     * @return goods.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 goods.create_time
     * @param createTime goods.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 goods.modified_time
     * @return goods.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 goods.modified_time
     * @param modifiedTime goods.modified_time
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 获取 goods.is_deleted
     * @return goods.is_deleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /** 
     * 设置 goods.is_deleted
     * @param isDeleted goods.is_deleted
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", storeId=").append(storeId);
        sb.append(", name=").append(name);
        sb.append(", sum=").append(sum);
        sb.append(", price=").append(price);
        sb.append(", avatar=").append(avatar);
        sb.append(", detailImage=").append(detailImage);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}