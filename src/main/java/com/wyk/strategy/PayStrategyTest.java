package com.wyk.strategy;

import com.wyk.strategy.pay.BillType;
import com.wyk.strategy.pay.PayBill;
import com.wyk.strategy.pay.PayBillFactory;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/3/19 21:34
 * @Modified By:
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        String orderCode = "";

        PayBill payBill = PayBillFactory.producePayBill(null, BillType.STORE_PUBLISH.getIndex());

        System.out.println(payBill);
    }

}
