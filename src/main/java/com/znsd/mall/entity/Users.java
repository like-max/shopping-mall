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
 * 用户表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Users extends Model<Users>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 头像
     */
    private String userIcon;
    /**
     * 手机号
     */
    private String userPhone;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户状态
     */
    private Integer userStatus;
    /**
     * 积分
     */
    private Integer userIntegral;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "Users{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userPassword=" + userPassword +
        ", userIcon=" + userIcon +
        ", userPhone=" + userPhone +
        ", createTime=" + createTime +
        ", userStatus=" + userStatus +
        ", userIntegral=" + userIntegral +
        "}";
    }
}
