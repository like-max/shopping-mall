package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 优惠券表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Coupon extends Model<Coupon>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "couponId", type = IdType.AUTO)
    private Integer couponId;
    /**
     * 商品主键
     */
    private Integer productId;
    /**
     * 品牌主键
     */
    private Integer brandId;
    /**
     * 类别主键
     */
    private Integer categoryId;
    /**
     * 优惠金额
     */
    private Integer couponMoney;
    /**
     * 优惠期初始期限
     */
    private Date couponTimeStart;
    /**
     * 优惠期结束期限
     */
    private Date couponTimeEnd;
    /**
     * 最少可用金额
     */
    private BigDecimal couponMin;
    /**
     * 优惠劵类别(0全场通用,1部分商品2单个品牌)
     */
    private Integer couponType;
    /**
     * 兑换所需积分
     */
    private Integer integral;


    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(Integer couponMoney) {
        this.couponMoney = couponMoney;
    }

    public Date getCouponTimeStart() {
        return couponTimeStart;
    }

    public void setCouponTimeStart(Date couponTimeStart) {
        this.couponTimeStart = couponTimeStart;
    }

    public Date getCouponTimeEnd() {
        return couponTimeEnd;
    }

    public void setCouponTimeEnd(Date couponTimeEnd) {
        this.couponTimeEnd = couponTimeEnd;
    }

    public BigDecimal getCouponMin() {
        return couponMin;
    }

    public void setCouponMin(BigDecimal couponMin) {
        this.couponMin = couponMin;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    @Override
    protected Serializable pkVal() {
        return this.couponId;
    }

    @Override
    public String toString() {
        return "Coupon{" +
        "couponId=" + couponId +
        ", productId=" + productId +
        ", brandId=" + brandId +
        ", categoryId=" + categoryId +
        ", couponMoney=" + couponMoney +
        ", couponTimeStart=" + couponTimeStart +
        ", couponTimeEnd=" + couponTimeEnd +
        ", couponMin=" + couponMin +
        ", couponType=" + couponType +
        ", integral=" + integral +
        "}";
    }
}
