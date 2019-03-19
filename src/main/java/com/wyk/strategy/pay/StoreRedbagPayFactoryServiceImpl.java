package com.wyk.strategy.pay;


import java.util.UUID;

public class StoreRedbagPayFactoryServiceImpl implements PayBillFactoryService{


	@Override
	public PayBill producePayBill(String outTradeNo) {

		PayBill payBill = new  PayBill();
		payBill.setSellerId(UUID.randomUUID().toString());
		payBill.setTotalFee(1);
		payBill.setTotalAmount(payBill.getTotalFee());
		payBill.setOperatorId("");
		payBill.setSubject("逛街去支付红包");
		payBill.setBody("逛街去支付红包");
		
		return payBill;
	}

}
