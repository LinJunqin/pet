package com.lin.pet.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author linjunqin
 * @date 2019-05-21
 */
public class GoodsImage implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -5717620375680764087L;

    /** 
     */ 
    private Long goodsImageId;

    /** 
     */ 
    private Long goodsId;

    /** 
     */ 
    private String url;

    /** 
     */ 
    private Date createTime;

    /** 
     */ 
    private Date modifiedTime;

    /** 
     * 构造查询条件
     */
    public GoodsImage(Long goodsImageId, Long goodsId, String url, Date createTime, Date modifiedTime) {
        this.goodsImageId = goodsImageId;
        this.goodsId = goodsId;
        this.url = url;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    /** 
     * 构造查询条件
     */
    public GoodsImage() {
        super();
    }

    /** 
     * 获取 goods_image.goods_image_id
     * @return goods_image.goods_image_id
     */
    public Long getGoodsImageId() {
        return goodsImageId;
    }

    /** 
     * 设置 goods_image.goods_image_id
     * @param goodsImageId goods_image.goods_image_id
     */
    public void setGoodsImageId(Long goodsImageId) {
        this.goodsImageId = goodsImageId;
    }

    /** 
     * 获取 goods_image.goods_id
     * @return goods_image.goods_id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /** 
     * 设置 goods_image.goods_id
     * @param goodsId goods_image.goods_id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /** 
     * 获取 goods_image.url
     * @return goods_image.url
     */
    public String getUrl() {
        return url;
    }

    /** 
     * 设置 goods_image.url
     * @param url goods_image.url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /** 
     * 获取 goods_image.create_time
     * @return goods_image.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 goods_image.create_time
     * @param createTime goods_image.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 goods_image.modified_time
     * @return goods_image.modified_time
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /** 
     * 设置 goods_image.modified_time
     * @param modifiedTime goods_image.modified_time
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
        sb.append(", goodsImageId=").append(goodsImageId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", url=").append(url);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append("]");
        return sb.toString();
    }
}