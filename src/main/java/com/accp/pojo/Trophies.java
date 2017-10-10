package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 奖励表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Trophies {

    /**
     * id,主键
     */
	private Integer tId;
    /**
     * 日期
     */
	private Date tDate;
    /**
     * 新推荐人数
     */
	private Integer tRecommend;
    /**
     * 总碰局数
     */
	private Integer tBumpsum;
    /**
     * 用户id,关联用户表
     */
	private Integer tUserid;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public Integer gettRecommend() {
        return tRecommend;
    }

    public void settRecommend(Integer tRecommend) {
        this.tRecommend = tRecommend;
    }

    public Integer gettBumpsum() {
        return tBumpsum;
    }

    public void settBumpsum(Integer tBumpsum) {
        this.tBumpsum = tBumpsum;
    }

    public Integer gettUserid() {
        return tUserid;
    }

    public void settUserid(Integer tUserid) {
        this.tUserid = tUserid;
    }
}
