package com.wyk.prototype;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 17:36
 * @Modified By:
 */
@Data
public class OrderDetail implements Cloneable {

    private Integer id;

    private Integer orderId;

    private String goodsId;

    private Integer standardId;

    private String goodsName;

    private String goodsPic;

    private Integer goodsPrice;

    private Integer activePrice;

    private Double goodsCount;

    private BigDecimal discountRatio;

    private Integer discountAmount;

    private Integer goodsAmount;

    private Integer goodsLockId;

    private Byte delFlag;

    private Date createTime;

    private Date updateTime;
    /**
     *  商品详情快照
     */
    private String goodsSnapshot;
    /**
     * 订单明细单个商品分销佣金
     */
    private Integer distributeCommission;

    private Byte saleType;
    /**
     * 订单明细均摊运费金额
     */
    private Integer avgCarriage;
    /**
     * 退款状态
     */
    private Byte refundStatus;
    /**
     * 退款次数,退款次数不超过三次
     */
    private Integer refundCount;

    /**
     * 商品分享码（分享者的邀请码）
     */
    private String shareCode;



    @Override
    protected OrderDetail clone(){
        OrderDetail detail = null;
        try {
            detail = (OrderDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return detail;
    }
}
