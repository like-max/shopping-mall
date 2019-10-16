package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Shoppingcar extends Model<Shoppingcar>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 购物车id
     */
    @TableId(value = "shoppingCarId", type = IdType.AUTO)
    private Integer shoppingCarId;
    /**
     * 商品主键
     */
    private Integer productId;
    /**
     * 规格库存主键
     */
    private Integer stockId;
    /**
     * 购买数量
     */
    private Integer sum;


    public Integer getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(Integer shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    protected Serializable pkVal() {
        return this.shoppingCarId;
    }

    @Override
    public String toString() {
        return "Shoppingcar{" +
        "shoppingCarId=" + shoppingCarId +
        ", productId=" + productId +
        ", stockId=" + stockId +
        ", sum=" + sum +
        "}";
    }
}
