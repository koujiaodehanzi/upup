package com.wyk.strategy.pay;


import java.util.UUID;

public class StorePublishFactoryServiceImpl implements PayBillFactoryService{

	@Override
	public PayBill producePayBill(String outTradeNo) {


		PayBill payBill = new PayBill();
		payBill.setSellerId(UUID.randomUUID().toString());
		payBill.setTotalFee(2); // 转成分
		payBill.setTotalAmount(payBill.getTotalFee());
		payBill.setOperatorId("");
		payBill.setSubject("逛街去发布购买店铺模板");
		payBill.setBody("逛街去发布购买店铺模板");
		
		return payBill;
	}

}
