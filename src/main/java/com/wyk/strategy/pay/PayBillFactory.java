package com.wyk.strategy.pay;


import java.util.HashMap;
import java.util.Map;

public class PayBillFactory {
	
	private static Map<String, PayBillFactoryService> payBillFactorys = new HashMap<String, PayBillFactoryService>();

	static {
		payBillFactorys.put(BillType.REDBAG_APP_DISTRIBUTE.getIndex().toString(), new StoreRedbagPayFactoryServiceImpl());
		payBillFactorys.put(BillType.STORE_ORDER.getIndex().toString(), new StoreOrderFactoryServiceImpl());
		payBillFactorys.put(BillType.STORE_PUBLISH.getIndex().toString(), new StorePublishFactoryServiceImpl());
	}
	
	public static PayBill producePayBill(String outTradeNo, Short billType){
		
		return payBillFactorys.get(String.valueOf(billType)).producePayBill(outTradeNo);
	}

	public Map<String, PayBillFactoryService> getPayBillFactorys() {
		return payBillFactorys;
	}

	public void setPayBillFactorys(
			Map<String, PayBillFactoryService> payBillFactorys) {
		payBillFactorys = payBillFactorys;
	}

}
