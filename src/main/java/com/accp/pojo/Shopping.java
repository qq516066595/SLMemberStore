package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 商品信息管理
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Shopping {

    /**
     *  主键
     */
	private Integer sId;
    /**
     * 商品名称
     */
	private String sName;
    /**
     * 市场价
     */
	private Double sPrice;
    /**
     * 优惠价格
     */
	private Double sDiscount;
    /**
     * 库存
     */
	private Integer sSpCount;
    /**
     * 商品状态1上架2下架
     */
	private Integer sSpState;
    /**
     * 最后修改的时间
     */
	private Date sLastDate;
    /**
     * 商品详情，以及规格
     */
	private String sSpDesc;
    /**
     * 单位
     */
	private String sCompany;


	public Integer getSId() {
		return sId;
	}

	public void setSId(Integer sId) {
		this.sId = sId;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public Double getSPrice() {
		return sPrice;
	}

	public void setSPrice(Double sPrice) {
		this.sPrice = sPrice;
	}

	public Double getSDiscount() {
		return sDiscount;
	}

	public void setSDiscount(Double sDiscount) {
		this.sDiscount = sDiscount;
	}

	public Integer getSSpCount() {
		return sSpCount;
	}

	public void setSSpCount(Integer sSpCount) {
		this.sSpCount = sSpCount;
	}

	public Integer getSSpState() {
		return sSpState;
	}

	public void setSSpState(Integer sSpState) {
		this.sSpState = sSpState;
	}

	public Date getSLastDate() {
		return sLastDate;
	}

	public void setSLastDate(Date sLastDate) {
		this.sLastDate = sLastDate;
	}

	public String getSSpDesc() {
		return sSpDesc;
	}

	public void setSSpDesc(String sSpDesc) {
		this.sSpDesc = sSpDesc;
	}

	public String getSCompany() {
		return sCompany;
	}

	public void setSCompany(String sCompany) {
		this.sCompany = sCompany;
	}

}
