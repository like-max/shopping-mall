package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 品牌
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "brandId", type = IdType.AUTO)
    private Integer brandId;
    /**
     * 类型的主键
     */
    private Integer categoryId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 品牌说明
     */
    private String brandExplain;
    /**
     * 品牌商标图片
     */
    private String brandImg;


    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandExplain() {
        return brandExplain;
    }

    public void setBrandExplain(String brandExplain) {
        this.brandExplain = brandExplain;
    }

    public String getBrandImg() {
        return brandImg;
    }

    public void setBrandImg(String brandImg) {
        this.brandImg = brandImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.brandId;
    }

    @Override
    public String toString() {
        return "Brand{" +
        "brandId=" + brandId +
        ", categoryId=" + categoryId +
        ", brandName=" + brandName +
        ", brandExplain=" + brandExplain +
        ", brandImg=" + brandImg +
        "}";
    }
}
