package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 签到表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Signin extends Model<Signin>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 签到主键
     */
    @TableId(value = "signinId", type = IdType.AUTO)
    private Integer signinId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 记录
     */
    private String record;
    /**
     * 连签天数
     */
    private Integer days;


    public Integer getSigninId() {
        return signinId;
    }

    public void setSigninId(Integer signinId) {
        this.signinId = signinId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    protected Serializable pkVal() {
        return this.signinId;
    }

    @Override
    public String toString() {
        return "Signin{" +
        "signinId=" + signinId +
        ", userId=" + userId +
        ", record=" + record +
        ", days=" + days +
        "}";
    }
}
