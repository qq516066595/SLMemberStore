package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 商品套餐表管理
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class ShoppingPacage {

    /**
     * 主键
     */
	private Integer pId;
    /**
     * 外键,商品表
     */
	private Integer sId;
    /**
     * 套餐名称
     */
	private String pName;
    /**
     * 套餐零售价
     */
	private Double pPrice;
    /**
     * 套餐优惠价格
     */
	private Double pDiscount;
    /**
     * 套餐库存
     */
	private Integer pSpCount;
    /**
     * 商品状态1上架2下架
     */
	private Integer pSpState;
    /**
     * 最后修改的时间
     */
	private Date pLastDate;
    /**
     * 商品详情，套餐里有什么？
     */
	private String pSpDesc;
    /**
     * 说明
     */
	private String pExplan;
    /**
     * 套餐类型
     */
	private String pType;


	public Integer getPId() {
		return pId;
	}

	public void setPId(Integer pId) {
		this.pId = pId;
	}

	public Integer getSId() {
		return sId;
	}

	public void setSId(Integer sId) {
		this.sId = sId;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public Double getPPrice() {
		return pPrice;
	}

	public void setPPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	public Double getPDiscount() {
		return pDiscount;
	}

	public void setPDiscount(Double pDiscount) {
		this.pDiscount = pDiscount;
	}

	public Integer getPSpCount() {
		return pSpCount;
	}

	public void setPSpCount(Integer pSpCount) {
		this.pSpCount = pSpCount;
	}

	public Integer getPSpState() {
		return pSpState;
	}

	public void setPSpState(Integer pSpState) {
		this.pSpState = pSpState;
	}

	public Date getPLastDate() {
		return pLastDate;
	}

	public void setPLastDate(Date pLastDate) {
		this.pLastDate = pLastDate;
	}

	public String getPSpDesc() {
		return pSpDesc;
	}

	public void setPSpDesc(String pSpDesc) {
		this.pSpDesc = pSpDesc;
	}

	public String getPExplan() {
		return pExplan;
	}

	public void setPExplan(String pExplan) {
		this.pExplan = pExplan;
	}

	public String getPType() {
		return pType;
	}

	public void setPType(String pType) {
		this.pType = pType;
	}

}
