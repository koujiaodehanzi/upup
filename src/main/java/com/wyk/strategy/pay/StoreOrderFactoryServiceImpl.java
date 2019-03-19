package com.wyk.strategy.pay;


import java.util.UUID;

public class StoreOrderFactoryServiceImpl implements PayBillFactoryService{

	@Override
	public PayBill producePayBill(String outTradeNo) {


		PayBill payBill = new PayBill();
		payBill.setSellerId(UUID.randomUUID().toString());
		payBill.setTotalFee(3); // 转成分
		payBill.setTotalAmount(payBill.getTotalFee());
		payBill.setOperatorId("");
		payBill.setSubject("逛街去支付订单");
		payBill.setBody("逛街去支付订单");
		
		return payBill;
	}

}
