package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品规格库存
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Productstock extends Model<Productstock> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "stockId", type = IdType.AUTO)
    private Integer stockId;
    /**
     * 商品主键
     */
    private Integer productId;
    /**
     * 标题（如颜色,尺码）
     */
    private String title;
    /**
     * 参数（如蓝色，32）
     */
    private String parameter;
    /**
     * 库存
     */
    private Integer stock;


    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    protected Serializable pkVal() {
        return this.stockId;
    }

    @Override
    public String toString() {
        return "Productstock{" +
        "stockId=" + stockId +
        ", productId=" + productId +
        ", title=" + title +
        ", parameter=" + parameter +
        ", stock=" + stock +
        "}";
    }
}
