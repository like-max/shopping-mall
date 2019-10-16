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
 * 购物积分记录表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Recordpoints extends Model<Recordpoints> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "recordPointsId", type = IdType.AUTO)
    private Integer recordPointsId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 操作时间
     */
    private Date operationTime;
    /**
     * 改变的数值
     */
    private Integer sumValue;
    /**
     * 操作说明
     */
    private String explaintext;


    public Integer getRecordPointsId() {
        return recordPointsId;
    }

    public void setRecordPointsId(Integer recordPointsId) {
        this.recordPointsId = recordPointsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getSumValue() {
        return sumValue;
    }

    public void setSumValue(Integer sumValue) {
        this.sumValue = sumValue;
    }

    public String getExplaintext() {
        return explaintext;
    }

    public void setExplaintext(String explaintext) {
        this.explaintext = explaintext;
    }

    @Override
    protected Serializable pkVal() {
        return this.recordPointsId;
    }

    @Override
    public String toString() {
        return "Recordpoints{" +
        "recordPointsId=" + recordPointsId +
        ", userId=" + userId +
        ", operationTime=" + operationTime +
        ", sumValue=" + sumValue +
        ", explaintext=" + explaintext +
        "}";
    }
}
