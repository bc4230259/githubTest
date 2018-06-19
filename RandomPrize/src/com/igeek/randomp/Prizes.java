package com.igeek.randomp;

import java.math.BigDecimal;

public class Prizes {
 private Integer supportCount;
 private BigDecimal rate;
 private Integer userCount=0;

public Integer getSupportCount() {
	return supportCount;
}
public void setSupportCount(Integer supportCount) {
	this.supportCount = supportCount;
}
public Integer getUserCount() {
	return userCount;
}
public void setUserCount(Integer userCount) {
	this.userCount = userCount;
}
public BigDecimal getRate() {
	return rate;
}
public void setRate(BigDecimal rate) {
	this.rate = rate;
}
 
}
