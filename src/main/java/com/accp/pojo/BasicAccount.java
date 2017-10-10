package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 基本账户
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class BasicAccount {

    /**
     * 日期
     */
	private Date bDate;
    /**
     * 摘要
     */
	private String bAbstract;
    /**
     * 入帐金额
     */
	private Float bEntry;
    /**
     * 出账金额
     */
	private Float bChargeOff;
    /**
     * 余额
     */
	private Float bBalance;

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getbAbstract() {
        return bAbstract;
    }

    public void setbAbstract(String bAbstract) {
        this.bAbstract = bAbstract;
    }

    public Float getbEntry() {
        return bEntry;
    }

    public void setbEntry(Float bEntry) {
        this.bEntry = bEntry;
    }

    public Float getbChargeOff() {
        return bChargeOff;
    }

    public void setbChargeOff(Float bChargeOff) {
        this.bChargeOff = bChargeOff;
    }

    public Float getbBalance() {
        return bBalance;
    }

    public void setbBalance(Float bBalance) {
        this.bBalance = bBalance;
    }
}
