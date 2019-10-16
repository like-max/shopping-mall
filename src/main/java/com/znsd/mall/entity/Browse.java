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
 * 浏览记录表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Browse extends Model<Browse>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 浏览记录id
     */
    @TableId(value = "browseId", type = IdType.AUTO)
    private Integer browseId;
    /**
     * 商品主键
     */
    private Integer productId;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 浏览时间
     */
    private Date browseTime;


    public Integer getBrowseId() {
        return browseId;
    }

    public void setBrowseId(Integer browseId) {
        this.browseId = browseId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Date browseTime) {
        this.browseTime = browseTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.browseId;
    }

    @Override
    public String toString() {
        return "Browse{" +
        "browseId=" + browseId +
        ", productId=" + productId +
        ", userId=" + userId +
        ", browseTime=" + browseTime +
        "}";
    }
}
