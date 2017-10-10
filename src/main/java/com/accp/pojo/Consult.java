package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 咨询管理表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Consult {

    /**
     * id,主键
     */
	private Integer cId;
    /**
     * 文件标题
     */
	private String cTitle;
    /**
     * 下载说明
     */
	private String cExplain;
    /**
     * 文件大小
     */
	private Float cFilesize;
    /**
     * 下载次数
     */
	private Integer cDownloadnum;
    /**
     * 发布状态:0为不发布,1为发布
     */
	private Integer cState;
    /**
     * 最后修改日期
     */
	private Date cModifydate;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    public String getcExplain() {
        return cExplain;
    }

    public void setcExplain(String cExplain) {
        this.cExplain = cExplain;
    }

    public Float getcFilesize() {
        return cFilesize;
    }

    public void setcFilesize(Float cFilesize) {
        this.cFilesize = cFilesize;
    }

    public Integer getcDownloadnum() {
        return cDownloadnum;
    }

    public void setcDownloadnum(Integer cDownloadnum) {
        this.cDownloadnum = cDownloadnum;
    }

    public Integer getcState() {
        return cState;
    }

    public void setcState(Integer cState) {
        this.cState = cState;
    }

    public Date getcModifydate() {
        return cModifydate;
    }

    public void setcModifydate(Date cModifydate) {
        this.cModifydate = cModifydate;
    }
}
