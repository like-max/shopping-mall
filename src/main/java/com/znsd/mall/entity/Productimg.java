package com.znsd.mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品图片
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
public class Productimg extends Model<Productimg>  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "productImgId", type = IdType.AUTO)
    private Integer productImgId;
    /**
     * 商品id
     */
    private Integer productId;
    /**
     * 商品上方展示图片(限5张按，隔开)
     */
    private String albumPics;
    /**
     * 商品小图片
     */
    private String albumPicsMin;
    /**
     * 商品详情图片
     */
    private String detailsImg;
    /**
     * 活动图片
     */
    private String activityImg;


    public Integer getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Integer productImgId) {
        this.productImgId = productImgId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getAlbumPicsMin() {
        return albumPicsMin;
    }

    public void setAlbumPicsMin(String albumPicsMin) {
        this.albumPicsMin = albumPicsMin;
    }

    public String getDetailsImg() {
        return detailsImg;
    }

    public void setDetailsImg(String detailsImg) {
        this.detailsImg = detailsImg;
    }

    public String getActivityImg() {
        return activityImg;
    }

    public void setActivityImg(String activityImg) {
        this.activityImg = activityImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.productImgId;
    }

    @Override
    public String toString() {
        return "Productimg{" +
        "productImgId=" + productImgId +
        ", productId=" + productId +
        ", albumPics=" + albumPics +
        ", albumPicsMin=" + albumPicsMin +
        ", detailsImg=" + detailsImg +
        ", activityImg=" + activityImg +
        "}";
    }
}
