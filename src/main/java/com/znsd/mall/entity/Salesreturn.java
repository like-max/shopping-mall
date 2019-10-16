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
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Salesreturn extends Model<Salesreturn> {

    private static final long serialVersionUID = 1L;

    /**
     * 退货表住址
     */
    @TableId(value = "salesReturnId", type = IdType.AUTO)
    private Integer salesReturnId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 商品订单id
     */
    private Integer orderId;
    /**
     * 退款金额
     */
    private BigDecimal orderMoney;
    /**
     * 申请时间
     */
    private Date applyForTime;
    /**
     * 审核结果   0.审核成功，待顾客退货 ，1.已退款，2，拒绝退货
     */
    private Integer ordeRresult;
    /**
     * 客服备注
     */
    private String remarks;
    /**
     * 收件人
     */
    private String linkman;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 退货订单号
     */
    private String orderNumber;


    public Integer getSalesReturnId() {
        return salesReturnId;
    }

    public void setSalesReturnId(Integer salesReturnId) {
        this.salesReturnId = salesReturnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Date getApplyForTime() {
        return applyForTime;
    }

    public void setApplyForTime(Date applyForTime) {
        this.applyForTime = applyForTime;
    }

    public Integer getOrdeRresult() {
        return ordeRresult;
    }

    public void setOrdeRresult(Integer ordeRresult) {
        this.ordeRresult = ordeRresult;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    protected Serializable pkVal() {
        return this.salesReturnId;
    }

    @Override
    public String toString() {
        return "Salesreturn{" +
        "salesReturnId=" + salesReturnId +
        ", userId=" + userId +
        ", orderId=" + orderId +
        ", orderMoney=" + orderMoney +
        ", applyForTime=" + applyForTime +
        ", ordeRresult=" + ordeRresult +
        ", remarks=" + remarks +
        ", linkman=" + linkman +
        ", phone=" + phone +
        ", address=" + address +
        ", orderNumber=" + orderNumber +
        "}";
    }
}
