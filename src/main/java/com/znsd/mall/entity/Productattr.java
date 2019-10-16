package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品属性表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Productattr extends Model<Productattr>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "productAttrId", type = IdType.AUTO)
    private Integer productAttrId;
    /**
     * 商品主键
     */
    private Integer productId;
    /**
     * 规格名称
     */
    private String specificationName;
    /**
     * 规格内容
     */
    private String specificationCentext;


    public Integer getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(Integer productAttrId) {
        this.productAttrId = productAttrId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSpecificationName() {
        return specificationName;
    }

    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
    }

    public String getSpecificationCentext() {
        return specificationCentext;
    }

    public void setSpecificationCentext(String specificationCentext) {
        this.specificationCentext = specificationCentext;
    }

    @Override
    protected Serializable pkVal() {
        return this.productAttrId;
    }

    @Override
    public String toString() {
        return "Productattr{" +
        "productAttrId=" + productAttrId +
        ", productId=" + productId +
        ", specificationName=" + specificationName +
        ", specificationCentext=" + specificationCentext +
        "}";
    }
}
