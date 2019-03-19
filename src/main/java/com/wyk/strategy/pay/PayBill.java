package com.wyk.strategy.pay;


public class PayBill {
	
	private Long merchantId;//商户Id
	
	private String subject = "";//title
	
	private String body = "";//商品描述
	
	private String sellerId;//收款账号
	
	private long totalAmount = 0;//支付金额
	
	private String operatorId = "";//收银员
	
	private String mchID;//微信支付服务商
	
	private String subMchID;//收款账号（微信支付为子商户 ）
	
	private long totalFee = 0;//支付金额
	
	private String wxAppID;//微信公众号账号
	
	//新大陆支付，账号相关信息（机构号、商户号、终端号以及加密方式）

	/**
	 * 状态
	 * 
	 * 0：待支付
	 * 
	 * 6004: 正在支付中
	 * 
	 * 6005: 已支付
	 * 
	 * 6006: 商户收款账号不存在
	 */
	private Integer status = 0;
	
	public PayBill(){
		
	}
	
	public PayBill(Integer status){
		this.status = status;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getMchID() {
		return mchID;
	}

	public void setMchID(String mchID) {
		this.mchID = mchID;
	}

	public String getSubMchID() {
		return subMchID;
	}

	public void setSubMchID(String subMchID) {
		this.subMchID = subMchID;
	}

	public long getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(long totalFee) {
		this.totalFee = totalFee;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getWxAppID() {
		return wxAppID;
	}

	public void setWxAppID(String wxAppID) {
		this.wxAppID = wxAppID;
	}

}
