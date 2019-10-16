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
 * 用户信息表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Usercenter extends Model<Usercenter> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "centerId", type = IdType.AUTO)
    private Integer centerId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 性别 1.男  0.女
     */
    private Integer centerSex;
    /**
     * 生日
     */
    private Date centerBirthday;
    /**
     * 职业
     */
    private String centerOccupation;
    /**
     * 收入
     */
    private Integer centerIncome;
    /**
     * 身份证
     */
    private String identity;
    /**
     * 会员地址
     */
    private String centerMember;


    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCenterSex() {
        return centerSex;
    }

    public void setCenterSex(Integer centerSex) {
        this.centerSex = centerSex;
    }

    public Date getCenterBirthday() {
        return centerBirthday;
    }

    public void setCenterBirthday(Date centerBirthday) {
        this.centerBirthday = centerBirthday;
    }

    public String getCenterOccupation() {
        return centerOccupation;
    }

    public void setCenterOccupation(String centerOccupation) {
        this.centerOccupation = centerOccupation;
    }

    public Integer getCenterIncome() {
        return centerIncome;
    }

    public void setCenterIncome(Integer centerIncome) {
        this.centerIncome = centerIncome;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCenterMember() {
        return centerMember;
    }

    public void setCenterMember(String centerMember) {
        this.centerMember = centerMember;
    }

    @Override
    protected Serializable pkVal() {
        return this.centerId;
    }

    @Override
    public String toString() {
        return "Usercenter{" +
        "centerId=" + centerId +
        ", userId=" + userId +
        ", centerSex=" + centerSex +
        ", centerBirthday=" + centerBirthday +
        ", centerOccupation=" + centerOccupation +
        ", centerIncome=" + centerIncome +
        ", identity=" + identity +
        ", centerMember=" + centerMember +
        "}";
    }
}
