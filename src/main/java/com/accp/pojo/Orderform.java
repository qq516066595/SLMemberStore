package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 订单表(重消购物和辅消购物)
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Orderform {

    /**
     * 主键id
     */
	private Integer id;
    /**
     * 单号，格式:sl-order-GUID
     */
	private String serialNumber;
    /**
     * 订单购货会员，用户表外键
     */
	private Integer userId;
    /**
     * 订单收货会员，用户表外键
     */
	private Integer takeUserId;
    /**
     * 购买时间
     */
	private Date buyTime;
    /**
     * 状态，0为未支付(购物车)，1为已支付
     */
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTakeUserId() {
		return takeUserId;
	}

	public void setTakeUserId(Integer takeUserId) {
		this.takeUserId = takeUserId;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
