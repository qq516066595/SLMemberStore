package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 提现明细
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class WithdrawDeposit {

    /**
     * 日期
     */
	private Date wDate;
    /**
     * 提现金额
     */
	private Float wCashWithdrawalAmount;
    /**
     * 转账金额
     */
	private Float wTransferAmount;
    /**
     * 状态
     */
	private Integer wState;

	public Date getwDate() {
		return wDate;
	}

	public void setwDate(Date wDate) {
		this.wDate = wDate;
	}

	public Float getwCashWithdrawalAmount() {
		return wCashWithdrawalAmount;
	}

	public void setwCashWithdrawalAmount(Float wCashWithdrawalAmount) {
		this.wCashWithdrawalAmount = wCashWithdrawalAmount;
	}

	public Float getwTransferAmount() {
		return wTransferAmount;
	}

	public void setwTransferAmount(Float wTransferAmount) {
		this.wTransferAmount = wTransferAmount;
	}

	public Integer getwState() {
		return wState;
	}

	public void setwState(Integer wState) {
		this.wState = wState;
	}
}
