package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 收货地址表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Usersite extends Model<Usersite> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "siteId", type = IdType.AUTO)
    private Integer siteId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 收货人姓名
     */
    private String siteName;
    /**
     * 收货人电话
     */
    private String sitePhone;
    /**
     * 默认发货地址：0->否；1->是
     */
    private Integer siteStatu;
    /**
     * 详细地址
     */
    private String siteAddress;
    /**
     * 邮编
     */
    private String postcode;
    /**
     * 省份
     */
    private String receiverProvince;
    /**
     * 城市
     */
    private String receiverCity;


    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSitePhone() {
        return sitePhone;
    }

    public void setSitePhone(String sitePhone) {
        this.sitePhone = sitePhone;
    }

    public Integer getSiteStatu() {
        return siteStatu;
    }

    public void setSiteStatu(Integer siteStatu) {
        this.siteStatu = siteStatu;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    @Override
    protected Serializable pkVal() {
        return this.siteId;
    }

    @Override
    public String toString() {
        return "Usersite{" +
        "siteId=" + siteId +
        ", userId=" + userId +
        ", siteName=" + siteName +
        ", sitePhone=" + sitePhone +
        ", siteStatu=" + siteStatu +
        ", siteAddress=" + siteAddress +
        ", postcode=" + postcode +
        ", receiverProvince=" + receiverProvince +
        ", receiverCity=" + receiverCity +
        "}";
    }
}
