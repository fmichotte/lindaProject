package com.lindacare.msg;

import java.util.Date;

public class InputMessage {
	
	private String userId;
	private String currencyFrom;
	private String currencyTo;
	private long amountSell;
	private long amountBuy;
	private long rate;
	private String timePlaced;
	private String originatingCountry;
	
	private Date received;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public long getAmountSell() {
		return amountSell;
	}
	public void setAmountSell(long amountSell) {
		this.amountSell = amountSell;
	}
	public long getAmountBuy() {
		return amountBuy;
	}
	public void setAmountBuy(long amountBuy) {
		this.amountBuy = amountBuy;
	}
	public long getRate() {
		return rate;
	}
	public void setRate(long rate) {
		this.rate = rate;
	}
	public String getTimePlaced() {
		return timePlaced;
	}
	public void setTimePlaced(String timePlaced) {
		this.timePlaced = timePlaced;
	}
	public String getOriginatingCountry() {
		return originatingCountry;
	}
	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}
	public Date getReceived() {
		return received;
	}
	public void setReceived(Date received) {
		this.received = received;
	}
	

}
