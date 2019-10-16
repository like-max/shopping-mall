package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 类别
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "categoryId", type = IdType.AUTO)
    private Integer categoryId;
    /**
     * 分类名称
     */
    private String typeName;
    /**
     * 上级id
     */
    private Integer parentId;
    /**
     * 类别图片
     */
    private String typeImg;


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTypeImg() {
        return typeImg;
    }

    public void setTypeImg(String typeImg) {
        this.typeImg = typeImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.categoryId;
    }

    @Override
    public String toString() {
        return "Category{" +
        "categoryId=" + categoryId +
        ", typeName=" + typeName +
        ", parentId=" + parentId +
        ", typeImg=" + typeImg +
        "}";
    }
}
