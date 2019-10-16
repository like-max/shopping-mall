package com.znsd.mall.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Shoppingorder extends Model<Shoppingorder>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    @TableId(value = "orderId", type = IdType.AUTO)
    private Integer orderId;
    /**
     * 商品库存id
     */
    private Integer productId;
    /**
     * 订单号
     */
    private Integer orderSn;
    /**
     * 提交时间
     */
    private Date createTime;
    /**
     * 订单总金额
     */
    private Double totalAmount;
    /**
     * 运费金额
     */
    private Double payAmount;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 订单类型
     */
    private Integer orderType;
    /**
     * 优惠劵抵扣金额
     */
    private String couponAmount;
    /**
     * 支付时间
     */
    private Date paymentTime;
    /**
     * 物流公司
     */
    private String deliverCompany;
    /**
     * 物流单号
     */
    private String deliverySh;
    /**
     * 可以获得的积分
     */
    private Integer integration;
    /**
     * 收货人姓名
     */
    private String receiverName;
    /**
     * 收货人电话
     */
    private String receiverPhone;
    /**
     * 发货时间
     */
    private Date deliveryTime;
    /**
     * 确认收货时间
     */
    private Date receiveTime;
    /**
     * 收货地址
     */
    private Integer addresId;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getDeliverCompany() {
        return deliverCompany;
    }

    public void setDeliverCompany(String deliverCompany) {
        this.deliverCompany = deliverCompany;
    }

    public String getDeliverySh() {
        return deliverySh;
    }

    public void setDeliverySh(String deliverySh) {
        this.deliverySh = deliverySh;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getAddresId() {
        return addresId;
    }

    public void setAddresId(Integer addresId) {
        this.addresId = addresId;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "Shoppingorder{" +
        "orderId=" + orderId +
        ", productId=" + productId +
        ", orderSn=" + orderSn +
        ", createTime=" + createTime +
        ", totalAmount=" + totalAmount +
        ", payAmount=" + payAmount +
        ", status=" + status +
        ", orderType=" + orderType +
        ", couponAmount=" + couponAmount +
        ", paymentTime=" + paymentTime +
        ", deliverCompany=" + deliverCompany +
        ", deliverySh=" + deliverySh +
        ", integration=" + integration +
        ", receiverName=" + receiverName +
        ", receiverPhone=" + receiverPhone +
        ", deliveryTime=" + deliveryTime +
        ", receiveTime=" + receiveTime +
        ", addresId=" + addresId +
        "}";
    }
}
