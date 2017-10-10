package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 奖金明细表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Bonusdetail {

    /**
     * 日期
     */
	private Date bDate;
    /**
     * 推荐奖
     */
	private Integer bRecommend;
    /**
     * 安置将
     */
	private Integer bArrange;
    /**
     * 对碰奖
     */
	private Integer bRightbump;
    /**
     * 积分消费奖
     */
	private Float bIntegralconsume;
    /**
     * 实发合计
     */
	private Float bTotal;

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public Integer getbRecommend() {
        return bRecommend;
    }

    public void setbRecommend(Integer bRecommend) {
        this.bRecommend = bRecommend;
    }

    public Integer getbArrange() {
        return bArrange;
    }

    public void setbArrange(Integer bArrange) {
        this.bArrange = bArrange;
    }

    public Integer getbRightbump() {
        return bRightbump;
    }

    public void setbRightbump(Integer bRightbump) {
        this.bRightbump = bRightbump;
    }

    public Float getbIntegralconsume() {
        return bIntegralconsume;
    }

    public void setbIntegralconsume(Float bIntegralconsume) {
        this.bIntegralconsume = bIntegralconsume;
    }

    public Float getbTotal() {
        return bTotal;
    }

    public void setbTotal(Float bTotal) {
        this.bTotal = bTotal;
    }
}
