package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户优惠券表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Usercoupon extends Model<Usercoupon>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "userCouponId", type = IdType.AUTO)
    private Integer userCouponId;
    /**
     * 优惠券主键
     */
    private Integer couponId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 兑换时间
     */
    private Date exchangeTime;


    public Integer getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(Integer userCouponId) {
        this.userCouponId = userCouponId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Date exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.userCouponId;
    }

    @Override
    public String toString() {
        return "Usercoupon{" +
        "userCouponId=" + userCouponId +
        ", couponId=" + couponId +
        ", userId=" + userId +
        ", exchangeTime=" + exchangeTime +
        "}";
    }
}
