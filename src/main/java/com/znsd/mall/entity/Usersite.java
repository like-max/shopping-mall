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
public class Usersite extends Model<Usersite>  implements Serializable{

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
     * 地址主键
     */
    private Integer addressId;
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

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    @Override
    protected Serializable pkVal() {
        return this.siteId;
    }

    @Override
    public String toString() {
        return "Usersite{" +
        "siteId=" + siteId +
        ", userId=" + userId +
        ", addressId=" + addressId +
        ", siteName=" + siteName +
        ", sitePhone=" + sitePhone +
        ", siteStatu=" + siteStatu +
        ", siteAddress=" + siteAddress +
        "}";
    }
}
