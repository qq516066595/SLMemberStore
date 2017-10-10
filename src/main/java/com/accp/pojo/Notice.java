package com.accp.pojo;

import java.util.Date;

/**
 * <p>
 * 公告管理表
 * </p>
 *
 * @author Gawain
 * @since 2017-10-10
 */
public class Notice {

    /**
     * 公告id,主键
     */
	private Integer nId;
    /**
     * 公告日期
     */
	private Date nDate;
    /**
     * 公告标题
     */
	private String nTitle;
    /**
     * 公告内容
     */
	private String nContent;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Date getnDate() {
        return nDate;
    }

    public void setnDate(Date nDate) {
        this.nDate = nDate;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }
}
