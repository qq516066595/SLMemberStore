package com.accp.pojo;

/**
 * <p>
 * 区域表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Area {

    /**
     * 用户区分左右的id,不设主键
     */
	private Integer aId;
    /**
     * 总人数
     */
	private Integer aHeadcount;
    /**
     * 新安置人数
     */
	private Integer aNewposit;
    /**
     * 剩余碰数
     */
	private Integer aBumpnumber;
    /**
     * 奖励表的id
     */
	private Integer aTrophiesid;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaHeadcount() {
        return aHeadcount;
    }

    public void setaHeadcount(Integer aHeadcount) {
        this.aHeadcount = aHeadcount;
    }

    public Integer getaNewposit() {
        return aNewposit;
    }

    public void setaNewposit(Integer aNewposit) {
        this.aNewposit = aNewposit;
    }

    public Integer getaBumpnumber() {
        return aBumpnumber;
    }

    public void setaBumpnumber(Integer aBumpnumber) {
        this.aBumpnumber = aBumpnumber;
    }

    public Integer getaTrophiesid() {
        return aTrophiesid;
    }

    public void setaTrophiesid(Integer aTrophiesid) {
        this.aTrophiesid = aTrophiesid;
    }
}
