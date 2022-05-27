package com.model2.mvc.service.domain.kakao;

import java.util.Date;
 
public class KakaoPayApprovalVO {
    
    //response
    private int quantity;
    private int tax_free_amount;
    private int vat_amount;
    
    private String aid;
    private String tid;
    private String cid;
    private String sid;
    private String partner_order_id;
    private String partner_user_id;
    private String payment_method_type;
    private String item_name;
    private String item_code;
    private String payload;
    
    private AmountVO amount;
    private CardVO card;
    
    private Date created_at; 
    private Date approved_at; 
    
    
    
	public KakaoPayApprovalVO() {
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getTax_free_amount() {
		return tax_free_amount;
	}



	public void setTax_free_amount(int tax_free_amount) {
		this.tax_free_amount = tax_free_amount;
	}



	public int getVat_amount() {
		return vat_amount;
	}



	public void setVat_amount(int vat_amount) {
		this.vat_amount = vat_amount;
	}



	public String getAid() {
		return aid;
	}



	public void setAid(String aid) {
		this.aid = aid;
	}



	public String getTid() {
		return tid;
	}



	public void setTid(String tid) {
		this.tid = tid;
	}



	public String getCid() {
		return cid;
	}



	public void setCid(String cid) {
		this.cid = cid;
	}



	public String getSid() {
		return sid;
	}



	public void setSid(String sid) {
		this.sid = sid;
	}



	public String getPartner_order_id() {
		return partner_order_id;
	}



	public void setPartner_order_id(String partner_order_id) {
		this.partner_order_id = partner_order_id;
	}



	public String getPartner_user_id() {
		return partner_user_id;
	}



	public void setPartner_user_id(String partner_user_id) {
		this.partner_user_id = partner_user_id;
	}



	public String getPayment_method_type() {
		return payment_method_type;
	}



	public void setPayment_method_type(String payment_method_type) {
		this.payment_method_type = payment_method_type;
	}



	public String getItem_name() {
		return item_name;
	}



	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}



	public String getItem_code() {
		return item_code;
	}



	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}



	public String getPayload() {
		return payload;
	}



	public void setPayload(String payload) {
		this.payload = payload;
	}



	public AmountVO getAmount() {
		return amount;
	}



	public void setAmount(AmountVO amount) {
		this.amount = amount;
	}



	public CardVO getCard() {
		return card;
	}



	public void setCard(CardVO card) {
		this.card = card;
	}



	public Date getCreated_at() {
		return created_at;
	}



	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}



	public Date getApproved_at() {
		return approved_at;
	}



	public void setApproved_at(Date approved_at) {
		this.approved_at = approved_at;
	}


	
    
}