package com.znsd.mall.entity;

import java.util.Date;
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
public class Salesreturn extends Model<Salesreturn>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 订单编号
     */
    private String orderSn;
    /**
     * 退货商品id
     */
    private String productId;
    /**
     * 退货数量
     */
    private Integer productCount;
    /**
     * 退货说明
     */
    private String reason;
    /**
     * 退货人姓名
     */
    private String returnName;
    /**
     * 退货人电话
     */
    private String returnPhone;
    /**
     * 退款方式
     */
    private Integer salesReturn;
    /**
     * 快递公司
     */
    private String exepressCompany;
    /**
     * 快递单号
     */
    private String courierNumber;
    /**
     * 凭证图片
     */
    private String proofPics;
    /**
     * 退货单号
     */
    private String returnSn;
    /**
     * 退款金额
     */
    private Double returnAmount;
    /**
     * 申请时间
     */
    private Date createTime;
    /**
     * 退货状态
     */
    private Integer status;
    /**
     * 审核状态
     */
    private Integer audit;
    /**
     * 备注
     */
    private String handleNote;
    /**
     * 收货人
     */
    private String receiveMan;
    /**
     * 收货时间
     */
    private Date receiveTime;
    /**
     * 收货地址
     */
    private Integer addresId;
    /**
     * 订单退货id
     */
    @TableId(value = "orderStatusId", type = IdType.AUTO)
    private String orderStatusId;
    /**
     * 退货原因
     */
    private Integer orderCause;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public Integer getSalesReturn() {
        return salesReturn;
    }

    public void setSalesReturn(Integer salesReturn) {
        this.salesReturn = salesReturn;
    }

    public String getExepressCompany() {
        return exepressCompany;
    }

    public void setExepressCompany(String exepressCompany) {
        this.exepressCompany = exepressCompany;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }

    public String getReturnSn() {
        return returnSn;
    }

    public void setReturnSn(String returnSn) {
        this.returnSn = returnSn;
    }

    public Double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Double returnAmount) {
        this.returnAmount = returnAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
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

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public Integer getOrderCause() {
        return orderCause;
    }

    public void setOrderCause(Integer orderCause) {
        this.orderCause = orderCause;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderStatusId;
    }

    @Override
    public String toString() {
        return "Salesreturn{" +
        "orderId=" + orderId +
        ", orderSn=" + orderSn +
        ", productId=" + productId +
        ", productCount=" + productCount +
        ", reason=" + reason +
        ", returnName=" + returnName +
        ", returnPhone=" + returnPhone +
        ", salesReturn=" + salesReturn +
        ", exepressCompany=" + exepressCompany +
        ", courierNumber=" + courierNumber +
        ", proofPics=" + proofPics +
        ", returnSn=" + returnSn +
        ", returnAmount=" + returnAmount +
        ", createTime=" + createTime +
        ", status=" + status +
        ", audit=" + audit +
        ", handleNote=" + handleNote +
        ", receiveMan=" + receiveMan +
        ", receiveTime=" + receiveTime +
        ", addresId=" + addresId +
        ", orderStatusId=" + orderStatusId +
        ", orderCause=" + orderCause +
        "}";
    }
}
