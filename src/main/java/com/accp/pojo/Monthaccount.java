package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 月结算表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Monthaccount {

    /**
     * 序号,主键
     */
	private Integer mSequence;
    /**
     * 月份
     */
	private Date mMonth;
    /**
     * 重复消费奖
     */
	private Float mRepetaward;
    /**
     * 重复消费款
     */
	private Float mRepetprice;
    /**
     * 实发合计
     */
	private Float mTotal;

	public Integer getmSequence() {
		return mSequence;
	}

	public void setmSequence(Integer mSequence) {
		this.mSequence = mSequence;
	}

	public Date getmMonth() {
		return mMonth;
	}

	public void setmMonth(Date mMonth) {
		this.mMonth = mMonth;
	}

	public Float getmRepetaward() {
		return mRepetaward;
	}

	public void setmRepetaward(Float mRepetaward) {
		this.mRepetaward = mRepetaward;
	}

	public Float getmRepetprice() {
		return mRepetprice;
	}

	public void setmRepetprice(Float mRepetprice) {
		this.mRepetprice = mRepetprice;
	}

	public Float getmTotal() {
		return mTotal;
	}

	public void setmTotal(Float mTotal) {
		this.mTotal = mTotal;
	}
}
