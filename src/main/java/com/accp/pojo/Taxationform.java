package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 申请表(报单表)
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Taxationform {

    /**
     * 主键id
     */
	private Integer id;
    /**
     * 单号，格式:sl-gh-GUID
     */
	private String serialNumber;
    /**
     * 报单购货会员，用户表外键
     */
	private Integer userId;
    /**
     * 报单收货会员，用户表外键
     */
	private Integer takeUserId;
    /**
     * 报单级别(账户级别)，申请级别表外键
     */
	private Integer levelId;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 状态，0为未激活，1为已激活
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

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
