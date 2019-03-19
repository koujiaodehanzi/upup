package com.wyk.strategy.pay;

/**
 * @author Bruce
 * @date 2018/7/13
 */
public enum BillType {

    REDBAG_APP_DISTRIBUTE((short)12, "红包APP支付红包"),

    STORE_PUBLISH((short)16, "逛街去发布购买店铺模板"),
    STORE_ORDER  ((short)17, "逛街去支付订单"),
    STORE_REDBAG ((short)18, "逛街去支付红包"),

    UNION_SPREAD ((short)19, "联盟推广平台支付");

    private Short index;
    private String desc;

    BillType(Short index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public Short getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }
}
