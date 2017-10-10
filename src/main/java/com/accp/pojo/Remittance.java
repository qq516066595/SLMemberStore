package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 汇款充值
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Remittance {

    /**
     * 汇款日期
     */
	private Date rDate;
    /**
     * 汇款金额
     */
	private Float rMoney;
    /**
     * 摘要
     */
	private String rAbstract;
    /**
     * 单号
     */
	private String rOdd;

	public Date getrDate() {
		return rDate;
	}

	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}

	public Float getrMoney() {
		return rMoney;
	}

	public void setrMoney(Float rMoney) {
		this.rMoney = rMoney;
	}

	public String getrAbstract() {
		return rAbstract;
	}

	public void setrAbstract(String rAbstract) {
		this.rAbstract = rAbstract;
	}

	public String getrOdd() {
		return rOdd;
	}

	public void setrOdd(String rOdd) {
		this.rOdd = rOdd;
	}
}
