package com.wyk.strategy.pay;


public interface PayBillFactoryService {
	
	PayBill producePayBill(String outTradeNo);

}
