package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Pmsproduct extends Model<Pmsproduct> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "productId", type = IdType.AUTO)
    private Integer productId;
    /**
     * 品牌的主键
     */
    private Integer brandId;
    /**
     * 类型的主键
     */
    private Integer categoryId;
    /**
     * 状态（0未删除，1已删除）
     */
    private Integer deleteStatus;
    /**
     * 上架状态 0未上架，1已上架
     */
    private Integer publishStatus;
    /**
     * 审核状态 0 未通过 1已通过
     */
    private Integer verifyStatus;
    /**
     * 销量
     */
    private Integer sale;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 折扣
     */
    private Integer discount;
    /**
     * 赠送的积分
     */
    private Integer giftPoint;
    /**
     * 标题
     */
    private String mainTitle;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 总库存
     */
    private Integer stockSum;
    /**
     * 搜索关键字
     */
    private String keywords;
    /**
     * 促销开始时间
     */
    private Date promotionStartTime;
    /**
     * 促销结束时间
     */
    private Date promotionEndTime;
    /**
     * 促销类型 0原价促销，1限时购
     */
    private Integer promotionType;
    /**
     * 促销折扣
     */
    private Integer promotionDiscount;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

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

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStockSum() {
        return stockSum;
    }

    public void setStockSum(Integer stockSum) {
        this.stockSum = stockSum;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public Integer getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(Integer promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    @Override
    protected Serializable pkVal() {
        return this.productId;
    }

    @Override
    public String toString() {
        return "Pmsproduct{" +
        "productId=" + productId +
        ", brandId=" + brandId +
        ", categoryId=" + categoryId +
        ", deleteStatus=" + deleteStatus +
        ", publishStatus=" + publishStatus +
        ", verifyStatus=" + verifyStatus +
        ", sale=" + sale +
        ", price=" + price +
        ", discount=" + discount +
        ", giftPoint=" + giftPoint +
        ", mainTitle=" + mainTitle +
        ", description=" + description +
        ", stockSum=" + stockSum +
        ", keywords=" + keywords +
        ", promotionStartTime=" + promotionStartTime +
        ", promotionEndTime=" + promotionEndTime +
        ", promotionType=" + promotionType +
        ", promotionDiscount=" + promotionDiscount +
        "}";
    }
}
