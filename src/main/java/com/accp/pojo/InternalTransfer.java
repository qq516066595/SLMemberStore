package com.accp.pojo;

/**
 * <p>
 * 内部转账
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class InternalTransfer {

    /**
     * 余额
     */
	private Float iBalance;
    /**
     * 转账目标会员
     */
	private String iTransferTargetMember;
    /**
     * 转账金额
     */
	private Float iTransferAmount;
    /**
     * 二级密码
     */
	private String iPassword;

    public Float getiBalance() {
        return iBalance;
    }

    public void setiBalance(Float iBalance) {
        this.iBalance = iBalance;
    }

    public String getiTransferTargetMember() {
        return iTransferTargetMember;
    }

    public void setiTransferTargetMember(String iTransferTargetMember) {
        this.iTransferTargetMember = iTransferTargetMember;
    }

    public Float getiTransferAmount() {
        return iTransferAmount;
    }

    public void setiTransferAmount(Float iTransferAmount) {
        this.iTransferAmount = iTransferAmount;
    }

    public String getiPassword() {
        return iPassword;
    }

    public void setiPassword(String iPassword) {
        this.iPassword = iPassword;
    }
}
