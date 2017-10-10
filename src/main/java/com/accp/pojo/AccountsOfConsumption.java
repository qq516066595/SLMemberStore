package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 消费账户
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class AccountsOfConsumption {

    /**
     * 日期
     */
	private Date aDate;
    /**
     * 摘要
     */
	private String aAbstract;
    /**
     * 入帐金额
     */
	private Float aEntry;
    /**
     * 出账金额
     */
	private Float aChargeOff;
    /**
     * 余额
     */
	private String aBalance;


	public Date getaDate() {
		return aDate;
	}

	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}

	public String getaAbstract() {
		return aAbstract;
	}

	public void setaAbstract(String aAbstract) {
		this.aAbstract = aAbstract;
	}

	public Float getaEntry() {
		return aEntry;
	}

	public void setaEntry(Float aEntry) {
		this.aEntry = aEntry;
	}

	public Float getaChargeOff() {
		return aChargeOff;
	}

	public void setaChargeOff(Float aChargeOff) {
		this.aChargeOff = aChargeOff;
	}

	public String getaBalance() {
		return aBalance;
	}

	public void setaBalance(String aBalance) {
		this.aBalance = aBalance;
	}

}
