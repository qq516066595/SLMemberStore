package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 下载中心表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Downloadcore {

    /**
     * id,主键
     */
	private Integer dId;
    /**
     * 标题
     */
	private String dTitle;
    /**
     * 简介
     */
	private String dAbstract;
    /**
     * 日期
     */
	private Date dDate;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdTitle() {
        return dTitle;
    }

    public void setdTitle(String dTitle) {
        this.dTitle = dTitle;
    }

    public String getdAbstract() {
        return dAbstract;
    }

    public void setdAbstract(String dAbstract) {
        this.dAbstract = dAbstract;
    }

    public Date getdDate() {
        return dDate;
    }

    public void setdDate(Date dDate) {
        this.dDate = dDate;
    }
}
