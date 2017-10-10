package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Users {

    /**
     * 用户名字
     */
	private String uUid;
    /**
     * 真实姓名
     */
	private String uName;
    /**
     * 密码
     */
	private String uPwd;
    /**
     * 手机
     */
	private String uPhone;
    /**
     * 移动电话
     */
	private String uYPhone;
    /**
     * 证件类型
     */
	private String uIdCatType;
    /**
     * 证件号码
     */
	private String uIdCat;
    /**
     * 邮件号码
     */
	private String uEmain;
    /**
     * 邮政编码
     */
	private Integer uPostCode;
    /**
     * 推荐人
     */
	private String uReferrer;
    /**
     * 开户行
     */
	private String uOpenAccount;
    /**
     * 开户人
     */
	private String uOpenMan;
    /**
     * 开户卡号
     */
	private String uOpenNumber;
    /**
     * 身份证图片正反面
     */
	private String uIdCatImg;
    /**
     * 银行卡图片
     */
	private String uBankImg;
    /**
     * 收获地址
     */
	private String uAddress;
    /**
     * 国家
     */
	private String uGuojia;
    /**
     * 注册时间
     */
	private Date uCareteDate;
    /**
     * 修改日期
     */
	private Date uUpdateDate;
    /**
     * 角色id
     */
	private Integer mRoleid;
    /**
     * 会员id
     */
	private Integer mVtype;


	public String getUUid() {
		return uUid;
	}

	public void setUUid(String uUid) {
		this.uUid = uUid;
	}

	public String getUName() {
		return uName;
	}

	public void setUName(String uName) {
		this.uName = uName;
	}

	public String getUPwd() {
		return uPwd;
	}

	public void setUPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public String getUPhone() {
		return uPhone;
	}

	public void setUPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getUYPhone() {
		return uYPhone;
	}

	public void setUYPhone(String uYPhone) {
		this.uYPhone = uYPhone;
	}

	public String getUIdCatType() {
		return uIdCatType;
	}

	public void setUIdCatType(String uIdCatType) {
		this.uIdCatType = uIdCatType;
	}

	public String getUIdCat() {
		return uIdCat;
	}

	public void setUIdCat(String uIdCat) {
		this.uIdCat = uIdCat;
	}

	public String getUEmain() {
		return uEmain;
	}

	public void setUEmain(String uEmain) {
		this.uEmain = uEmain;
	}

	public Integer getUPostCode() {
		return uPostCode;
	}

	public void setUPostCode(Integer uPostCode) {
		this.uPostCode = uPostCode;
	}

	public String getUReferrer() {
		return uReferrer;
	}

	public void setUReferrer(String uReferrer) {
		this.uReferrer = uReferrer;
	}

	public String getUOpenAccount() {
		return uOpenAccount;
	}

	public void setUOpenAccount(String uOpenAccount) {
		this.uOpenAccount = uOpenAccount;
	}

	public String getUOpenMan() {
		return uOpenMan;
	}

	public void setUOpenMan(String uOpenMan) {
		this.uOpenMan = uOpenMan;
	}

	public String getUOpenNumber() {
		return uOpenNumber;
	}

	public void setUOpenNumber(String uOpenNumber) {
		this.uOpenNumber = uOpenNumber;
	}

	public String getUIdCatImg() {
		return uIdCatImg;
	}

	public void setUIdCatImg(String uIdCatImg) {
		this.uIdCatImg = uIdCatImg;
	}

	public String getUBankImg() {
		return uBankImg;
	}

	public void setUBankImg(String uBankImg) {
		this.uBankImg = uBankImg;
	}

	public String getUAddress() {
		return uAddress;
	}

	public void setUAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getUGuojia() {
		return uGuojia;
	}

	public void setUGuojia(String uGuojia) {
		this.uGuojia = uGuojia;
	}

	public Date getUCareteDate() {
		return uCareteDate;
	}

	public void setUCareteDate(Date uCareteDate) {
		this.uCareteDate = uCareteDate;
	}

	public Date getUUpdateDate() {
		return uUpdateDate;
	}

	public void setUUpdateDate(Date uUpdateDate) {
		this.uUpdateDate = uUpdateDate;
	}

	public Integer getMRoleid() {
		return mRoleid;
	}

	public void setMRoleid(Integer mRoleid) {
		this.mRoleid = mRoleid;
	}

	public Integer getMVtype() {
		return mVtype;
	}

	public void setMVtype(Integer mVtype) {
		this.mVtype = mVtype;
	}

}
