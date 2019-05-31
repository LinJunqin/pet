package com.lin.pet.entity.dto.output;

import java.math.BigDecimal;

public class GoodsSampleDTO {

    /**
     */
    private Long goodsId;


    /**
     */
    private String name;
    /**
     */
    private BigDecimal price;

    /**
     */
    private String avatar;

    public GoodsSampleDTO(Long goodsId, String name, BigDecimal price, String avatar) {
        this.goodsId = goodsId;
        this.name = name;
        this.price = price;
        this.avatar = avatar;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
