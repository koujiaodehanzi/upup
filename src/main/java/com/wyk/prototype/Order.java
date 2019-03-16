package com.wyk.prototype;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/16 17:32
 * @Modified By:
 */
@Data
public class Order implements Cloneable {

    private Integer id;

    private String batchCode;

    private String orderCode;

    private String unionId;

    private Integer shopId;

    private String templateId;

    private Integer totalAmount;

    /**
     * 订单退款总额
     */
    private Integer refundAmount;

    /**
     * 订单分销佣金总额
     */
    private Integer distributeCommission;

    private Double totalCount;

    private String buyerName;

    private String telephone;

    private String address;

    private String remark;

    private Integer couponId;

    private Integer couponMoney;

    private String logisticsCompany;

    private String logisticsCode;

    private Integer carriage;

    private Date payTime;

    private Byte payStatus;

    private Integer classifyOne;

    /**
     * 促销活动类型:0-正常销售；1-拼团；2-砍价；3-限时购
     */
    private Byte saleType;

    /**
     * 营销活动id
     */
    private Integer saleActiveId;

    private Byte delFlag;

    private Byte readFlag;

    private Date createTime;

    private Date updateTime;

    private Date promiseSendTime;

    private List<OrderDetail> details;

    @Override
    protected Order clone() throws CloneNotSupportedException {
        Order order = null;
        try {
            order = (Order)super.clone();
            if (details != null){
                List<OrderDetail> detailList = new ArrayList<>();
                for (OrderDetail detail : this.details){
                    detailList.add(detail.clone());
                }
                order.setDetails(detailList);
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return order;
    }

    public Order deepClone(){
        Order order = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            order = (Order)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
        return order;
    }
}
